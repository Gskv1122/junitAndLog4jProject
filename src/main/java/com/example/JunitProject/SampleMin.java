package com.example.JunitProject;

public class SampleMin {
	public int findmin(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public String findmaxlength(String[] a) {
		String max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max=a[i];
				
			}
		}
		return max;
	}
	
		
	}


