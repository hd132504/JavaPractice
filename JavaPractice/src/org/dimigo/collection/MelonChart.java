package org.dimigo.collection;

import java.util.*;

public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();

		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));
		
		System.out.println("-- << 멜론 차트 >> --");
		printList(list);
		System.out.println();
		
		list.add(1, new Music("레옹", "이유갓지"));
		System.out.println("-- << 2위 곡 추가 >> --");
		printList(list);
		System.out.println();
		
		list.set(2, new Music("맙소사", "황태지"));
		System.out.println("-- << 3위 곡 변경 >> --");
		printList(list);
		System.out.println();
		
		list.remove(list.size() - 1);
		System.out.println("-- << 4위 곡 삭제 >> --");
		printList(list);
		System.out.println();
		
		list.clear();
		System.out.println("-- << 전체 곡 삭제 >> --");
	}
	
	public static void printList(List<Music> list){
		for(int i = 0; i < list.size(); i++){
			System.out.println(i+1 + ". " + list.get(i).toString());
		}
	}
}
