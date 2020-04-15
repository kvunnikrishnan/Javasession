package com.unni.practicelession;

public class DividedBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		
       for(int i=0;i<n;i++) {
			
			if (i%3==0) {
				System.out.println("A");
			}else if (i%5==0) {
				System.out.println("B");
				
			}else if (i%3==0 && i%5==0) {
				System.out.println("C");
			} else {
				System.out.println(+i);
			}
		}
		
	}

	}
	
	
	
