package main;

import java.util.Scanner;
import dao.QuestionDao;
import model.*;

public class Main {
	
	public static Scanner reader = new Scanner(System.in);
	public static QuestionDao questionDao = new QuestionDao();
	public static question ques = new question();
	public static String name;
	public static char operationType;
	public static int corectIns = 0, incorectIns = 0;
	
	public static final String ANSI_GREEN = "\u001B[32m";
	
	public static void Add() {
		System.out.println("Entre new Question : ");
    	ques.setQuestion(reader.next());
    	System.out.println("Entre new Option1 : ");
    	ques.setOption1(reader.next());
    	System.out.println("Entre new Option2 : ");
    	ques.setOption2(reader.next());
    	System.out.println("Entre new Option3 : ");
    	ques.setOption3(reader.next());
    	System.out.println("Entre new Option4 : ");
    	ques.setOption4(reader.next());
    	System.out.println("Entre new Answer Numbre : ");
    	ques.setAnswer(reader.next());
    	
    	if (questionDao.insert(ques)) {
    		System.out.println("Add Successfully");
    	}else {
    		System.out.println("Error Occurred!");
    	}
	}
	
	public static void Edit() {
		System.out.println("Entre Question ID to Edit : ");
    	int id = reader.nextInt();
    	System.out.println("Entre new Question : ");
    	ques.setQuestion(reader.next());
    	System.out.println("Entre new Option1 : ");
    	ques.setOption1(reader.next());
    	System.out.println("Entre new Option2 : ");
    	ques.setOption2(reader.next());
    	System.out.println("Entre new Option3 : ");
    	ques.setOption3(reader.next());
    	System.out.println("Entre new Option4 : ");
    	ques.setOption4(reader.next());
    	System.out.println("Entre new Answer Numbre : ");
    	ques.setAnswer(reader.next());
    	
    	if (questionDao.update(id,ques)) {
    		System.out.println("Edit Successfully");
    	}else {
    		System.out.println("Error Occurred!");
    	}
	}
	
	public static void Remove() {
		System.out.println("Entre Question ID to Remove : ");
    	if (questionDao.delete(reader.nextInt())) {
    		System.out.println("Removed Successfully");
    	}else {
    		System.out.println("Error Occurred!");
    	}
	}
	
	public static void Lister() {
		for (question question : questionDao.getAll()) {
			System.out.println("\nQuestion"+question.getId()+":"+question.getQuestion());
		}
	}
	
	public static void Quiz() {
		for (question question : questionDao.getAll()) {
			System.out.println("\n\nQuestion"+question.getId()+":"+question.getQuestion());
			System.out.println("1-"+question.getOption1()+"."
					+ "\n2-"+question.getOption2()+"."
					+ "\n3-"+question.getOption3()+""
					+ "\n4-"+question.getOption4()+".");
			System.out.print("Your Answer is:");
			char answer = reader.next().charAt(0);
			if(answer == question.getAnswer().charAt(0)) {
				System.out.println("\n==========> Correct!");
				corectIns++;
			}else {
				System.out.println("\n==========> InCorrect!");
				incorectIns++;
			}
		}

		System.out.println("\n\n[http://localhost:8080/brief9-javaweb-todo/Question?count="+questionDao.getAll().size()
				+"&name="+name+"+&corect="+corectIns+"+&incorect="+incorectIns+"]\n\n");

	}
	
	public static void Revision() {
		for (question question : questionDao.getAll()) {
			System.out.println("\n\nQuestion"+question.getId()+":"+question.getQuestion());
			System.out.println("1-"+question.getOption1()+"."
					+ "\n2-"+question.getOption2()+"."
					+ "\n3-"+question.getOption3()+""
					+ "\n4-"+question.getOption4()+".");
			System.out.print("Your Answer is:");
			char answer = reader.next().charAt(0);
			
			System.out.println("Corect Answer is:" + question.getOption2());
		}
	}
	
	public static void main(String[] args) {
		

		System.out.println("****** KickIt CTB Quiz App ******");
		System.out.println("Enter your Name: ");
		name = reader.nextLine();
		System.out.println("Hi there, " + name + "!");

		do {
			System.out.println("\n1-Start Quiz."
					+ "\n2-View Question."
					+ "\n3-Add Question."
					+ "\n4-Edit Question."
					+ "\n5-Remove Question."
					+ "\n6-Revision Question."
					+ "\n0-Exit.");
			System.out.print("Enter type of the operation: ");
			operationType = reader.next().charAt(0);

			if (operationType == '0') {
				System.out.println("Exit!");
				reader.close();
				break; 
				
			} else if (operationType == '1') { // Start Quiz
				Quiz();
	        } else if (operationType == '2') { 
	        	Lister();
	        } else if (operationType == '3') { 
	        	Add();
	        } else if (operationType == '4') { 
	        	Edit();
	        } else if (operationType == '5') { 
	        	Remove();
	        } else if (operationType == '6') { 
	        	Revision();
	        } else {
				System.out.println("Error opertaion doesnt exist!");
				continue;
			}

		} while (true);

		reader.close();       
	}

}
