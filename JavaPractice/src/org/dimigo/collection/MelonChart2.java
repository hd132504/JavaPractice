package org.dimigo.collection;

import java.util.*;

public class MelonChart2 {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		map.put("발라드", new ArrayList<Music>());
		map.put("댄스", new ArrayList<Music>());

		map.get("발라드").add(new Music("내 첫사랑", "베리굿"));
		map.get("발라드").add(new Music("또 다시 사랑", "임창정"));
		map.get("발라드").add(new Music("부산에 가면", "박진영"));
		
		map.get("댄스").add(new Music("커피", "유재환,김예림"));
		map.get("댄스").add(new Music("다 잘될거야", "쿨"));
		
		System.out.println("-- << 멜론 장르별 차트 >> --");
		printMap(map);
		System.out.println();
		
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		System.out.println("-- << 발라드 3위 곡 변경 >> --");
		printMap(map);
		System.out.println();
		
		map.get("발라드").remove(0);
		System.out.println("-- << 발라드 1위 곡 삭제 >> --");
		printMap(map);
		System.out.println();
		
		map.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String s : map.keySet()){
			System.out.println("[" + s + "]");
			for(int i = 1; i <= map.get(s).size(); i++){
				System.out.println(i + ". " + map.get(s).get(i - 1));
			}
		}
	}
}
