package org.ella.day13.collection.music.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ManageMusic {

	private List<Music> mList;

	public ManageMusic() {
		mList = new ArrayList<Music>();
	}

	public void registerMusic(Music music) {
		mList.add(music);
	}

	public void registerMusicFirst(Music music) {
		mList.add(0, music);
	}

	public List<Music> selectAllMusic() {
		return mList;
	}

	public List<Music> searchOneByTitle(String title) {
		if (title != null) {
			List<Music> searchList = new ArrayList<Music>();
			for (Music music : mList) {
				if (title.equals(music.getTitle())) {
					searchList.add(music);
				}
			}
			return searchList;
		}
		return null;
	}

	// 해당하는 위치(인덱스)에 있는 값을 교체하기 위해서 입력받음
	// 첫번째에 있는 값 교체하려면 1이라는 순서를 입력받아야 교체하지?
	public int searchIndexByName(String name) {
		if (name != "" && name != null) {
			int index = 0;
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}

	public Music searchMusicByTitle(String name) {
		if (name != "" && name != null) {
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}

	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}

	public int searchOneBySinger(String singer) {
		if (singer != null) {
			int count = 0;
			for (Music music : mList) {
				if (singer.equals(music.getSinger())) {
					return count;
				}
				count++;
			}
		}
		return 0;
	}

	public void deleteMusic(int index) {
		mList.remove(index);
	}

}
