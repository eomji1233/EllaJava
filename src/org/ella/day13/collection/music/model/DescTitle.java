package org.ella.day13.collection.music.model;

import java.util.Comparator;

public class DescTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle()) * -1;
		// 1일 때 -1, -1일 때 1로 바뀌며 역순이 된다!
		// 그냥 숫자나 글자면 바로 쓸 수 있지만 객체라서 오버라이딩 해야함
	}

}
