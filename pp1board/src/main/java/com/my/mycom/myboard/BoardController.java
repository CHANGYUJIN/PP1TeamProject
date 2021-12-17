package com.my.mycom.myboard;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * Handles requests for the application home page.
 */  
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardServiece; 
	
	//목록 보기 list 
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", boardServiece.getBoardList());	
		return "list";
	}
	
	//추가 폼 add 
	@RequestMapping(value = "/add", method = RequestMethod.GET) 
	public String addPost() {
		return "addpostform"; 
	}
	
	//추가된 데이터 저장 add ok - 함수를 통해 폼에서 받아온 데이터를 디비에 저장 
	@RequestMapping(value = "/addok", method = RequestMethod.POST)
	public String addPostOK(BoardVO vo, HttpServletRequest request) throws IOException {
		
		String filename = null;
		String realPath = request.getSession().getServletContext().getRealPath("img");
		File dir = new File(realPath);
		if(!dir.exists()) dir.mkdirs();
		MultipartFile uploadPhoto = vo.getUploadPhoto();
		if (!uploadPhoto.isEmpty()) {
			String originalFileName = uploadPhoto.getOriginalFilename();
			String ext = FilenameUtils.getExtension(originalFileName);	//확장자 구하기
			UUID uuid = UUID.randomUUID();	//UUID 구하기
			filename=uuid+"."+ext;
			uploadPhoto.transferTo(new File(realPath + filename));
		}
		vo.setFilename(filename);
		
		int i = boardServiece.insertBoard(vo);
		
		if ( i==0 ) {
			System.out.println("Something went wrong. Please retry."); }
		
		else {
			System.out.println("Successfully uploaded." ); } 
		
		return "redirect:list"; 
	}
	
	
	//수정 폼 
	@RequestMapping(value = "/editpost/{id}", method = RequestMethod.GET) 
	public String editPost(@PathVariable("id") int id, Model model) {
		BoardVO boardVO = boardServiece.getBoard(id);
		model.addAttribute("boardVO", boardVO); 
		return "editform"; 
	}
			
	//수정 ok 폼 
	@RequestMapping(value = "/editok", method = RequestMethod.POST)
	public String editPostOK(BoardVO vo) {
		
		int i = boardServiece.insertBoard(vo);
		
		if ( i==0 ) {
			System.out.println("Something went wrong. Please retry."); }
		
		else {
			System.out.println("Successfully uploaded!" ); } 
		
		return "redirect:list"; 
	}
	
	//삭제 폼 
	@RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
	public String deletePost(@PathVariable("id") int id) {
		int i = boardServiece.deleteBoard(id);
		
		if(i==0) {
			System.out.println("Something went wrong. Please retry.");
		}
		else {
			System.out.println("Successfully deleted.");
		}
		
	return "redirect:../list";
	
	}
	
	
	
}
