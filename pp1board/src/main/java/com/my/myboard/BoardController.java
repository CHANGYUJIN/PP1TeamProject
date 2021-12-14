package com.my.myboard;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardServiece; 
	
	//목록 보기 list 
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", boardServiece.getBoardList());	
		return "posts";
	}
	
	//추가 폼 add 
	@RequestMapping(value = "/board/add", method = RequestMethod.GET) 
	public String addPost() {
		return "addpostform"; 
	}
	
	//추가된 데이터 저장 add ok - 함수를 통해 폼에서 받아온 데이터를 디비에 저장 
	@RequestMapping(value = "/addok", method = RequestMethod.POST)
	public String addPostOK(BoardVO vo) {
		
		int i = boardServiece.insertBoard(vo);
		
		if ( i==0 ) {
			System.out.println("데이터 추가 실패"); }
		
		else {
			System.out.println("데이터 추가 성공!!!" ); } 
		
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
			System.out.println("데이터 추가 실패"); }
		
		else {
			System.out.println("데이터 추가 성공!!!" ); } 
		
		return "redirect:list"; 
	}
	
	//삭제 폼 
	@RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
	public String deletePost(@PathVariable("id") int id) {
		int i = boardServiece.deleteBoard(id);
		
		if(i==0) {
			System.out.println("데이터 삭제 실패 ");
		}
		else {
			System.out.println("데이터 삭제 성공 ");
		}
		
	return "redirect:../list";
	
	}
	
	
	
}
