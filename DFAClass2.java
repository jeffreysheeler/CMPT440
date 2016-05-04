/*
 * file: DFAClass2.java
 * author: Jeffrey Sheeler
 * course: CMPT 440
 * assignment: Final Project
 * due date: May 3, 2016
 * version: 1
 * 
 * This file contains the declaration of the DFAClass
 */


import java.util.*;

public class DFAClass2 {
	private static final int q0 = 0;
	private static final int q1 = 1;
	private static final int q2 = 2;
	private static final int q3 = 3;
	private static final int q4 = 4;
	private static final int q5 = 5;
	private static final int q6 = 6;
	private static final int q7 = 7;
	private static final int q8 = 8;
	private static final int q9 = 9;
	private static final int q10 = 10;
	private static final int q11 = 11;
	private static final int q12 = 12;
	private static final int q13 = 13;
	private static final int q18 = 14;
	private static final int q19 = 15;
	private static final int q20 = 16;
	private static final int q23 = 17;
	private static final int q24 = 18;
	private static final int q25 = 19;
	private static final int q27 = 20;
	private static final int q28 = 21;
	private static final int q29 = 22;
	private static final int q30 = 23;
	private static final int q31 = 24;
	private static final int q33 = 25;
	private static final int q34 = 26;
	private static final int q35 = 27;
	private static final int q36 = 28;
	private static final int q37 = 29;
	private static final int q38 = 30;
	private static final int q39 = 31;
	private static final int q40 = 32;
	private static final int q41 = 34;
	private static final int e = 33;
	
	private int state;
	
	private HashMap<Character, Integer> setChar = new HashMap<Character,Integer>();
	
	
	/*
	 * delta
	 *
	 * This function returns the value of the current state given the current state and current character
	 * 
	 * Parameters:
	 *   N/A
	 * 
	 * Return value: new current state
	 */
	//a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,0,1,2,3,4,5,6,7,8,9,",(,),*,+,space,=,-
	private int[][] delta = {{q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q18,	q1,	q18,	q18,	q18,	q18,	q18,	q27,	q18,	q18,	q18,	q18,	q36,	q36,	q36,	q36,	q36,	q36,	q36,	q36,	q36,	q36,	q36,	q36,	q36,	q33,	q36,	q36,	q36,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q2,	q2,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q36,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	q3,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q4,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q5,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q6,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q7,	e,	e},
			{q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	q9,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	q8,	e,	e,	e,	e,	e,	q39,	e,	e},
			{q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	q9,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q40,	e,	e,	e,	e,	e,	e,	e},
			{q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	q10,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q38,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q11,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q36,	e,	e},
			{q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q23,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	q24,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	q20,	e,	e,	e,	e,	q37,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	q24,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q25,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{q28,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q37,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q29,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q30,	e,	e},
			{q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	q31,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q34},
			{q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	q34,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q34,	e,	q35},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,  e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q41,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q37,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q19,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q13,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q11,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	q12,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e},
			{e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e,	e}};
	
	
	/*
	 * DFAClass2
	 * 
	 * This class sets each character to a value for the second index of the array
	 */
	public DFAClass2(){
		setChar.put((Character)('a'), (Integer)(0));
		setChar.put((Character)('b'), (Integer)(1));
		setChar.put((Character)('c'), (Integer)(2));
		setChar.put((Character)('d'), (Integer)(3));
		setChar.put((Character)('e'), (Integer)(4));
		setChar.put((Character)('f'), (Integer)(5));
		setChar.put((Character)('g'), (Integer)(6));
		setChar.put((Character)('h'), (Integer)(7));
		setChar.put((Character)('i'), (Integer)(8));
		setChar.put((Character)('j'), (Integer)(9));
		setChar.put((Character)('k'), (Integer)(10));
		setChar.put((Character)('l'), (Integer)(11));
		setChar.put((Character)('m'), (Integer)(12));
		setChar.put((Character)('n'), (Integer)(13));
		setChar.put((Character)('o'), (Integer)(14));
		setChar.put((Character)('p'), (Integer)(15));
		setChar.put((Character)('q'), (Integer)(16));
		setChar.put((Character)('r'), (Integer)(17));
		setChar.put((Character)('s'), (Integer)(18));
		setChar.put((Character)('t'), (Integer)(19));
		setChar.put((Character)('u'), (Integer)(20));
		setChar.put((Character)('v'), (Integer)(21));
		setChar.put((Character)('w'), (Integer)(22));
		setChar.put((Character)('x'), (Integer)(23));
		setChar.put((Character)('y'), (Integer)(24));
		setChar.put((Character)('z'), (Integer)(25));
		setChar.put((Character)('0'), (Integer)(26));
		setChar.put((Character)('1'), (Integer)(27));
		setChar.put((Character)('2'), (Integer)(28));
		setChar.put((Character)('3'), (Integer)(29));
		setChar.put((Character)('4'), (Integer)(30));
		setChar.put((Character)('5'), (Integer)(31));
		setChar.put((Character)('6'), (Integer)(32));
		setChar.put((Character)('7'), (Integer)(33));
		setChar.put((Character)('8'), (Integer)(34));
		setChar.put((Character)('9'), (Integer)(35));
		setChar.put((Character)('"'), (Integer)(36));
		setChar.put((Character)('('), (Integer)(37));
		setChar.put((Character)(')'), (Integer)(38));
		setChar.put((Character)('*'), (Integer)(39));
		setChar.put((Character)('+'), (Integer)(40));
		setChar.put((Character)(' '), (Integer)(41));
		setChar.put((Character)('='), (Integer)(42));
		setChar.put((Character)('-'), (Integer)(43));
	}
	
	/*
	 * setColor
	 *
	 * This function figures out what color should be represented for each specific set of code
	 * 
	 * Parameters:
	 *   in: the text in the textPane
	 * 
	 * Return value: the color that should be typed
	 */
	
	public String setColor(String in){
		String color = "";
		state = q0;
		for(int i = 0; i<in.length(); i++){
			try{
				state = delta[state][setChar.get(in.charAt(i))];
				switch(state){
					case q6:
					case q7:
					case q8:
					case q9:
					case q10:
					case q11:
					case q12:
					case q13:
					case q38:
					case q39:
					case q40:	color = "blue";
								break;
					case q36:
					case q37:
					case q19:
					case q20:
					case q23:
					case q24:
					case q25:	color = "purple";
								break;
					case q29:
					case q30:
					case q31:	color = "orange";
								break;
					case q34:
					case q41:
					case q35:	color = "green";
								break;
					case e:		color = "red";
								break;
					default:	color = "black";
								break;
				}
			}
			catch(Exception ex){
			
			}
		}
		return color;
			
	}
	
	/*
	 * reset
	 *
	 * This function resets the current state back to q0
	 * 
	 * Parameters:
	 *   N/A
	 * 
	 * Return value: N/A
	 */
	
	public void reset(){
		state = q0;
	}
	

			
}
