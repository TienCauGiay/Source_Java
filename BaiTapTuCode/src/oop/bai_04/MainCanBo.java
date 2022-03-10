package oop.bai_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCanBo {

	public static void main(String[] args) {
		List<CanBo> cb1 = new ArrayList<CanBo>();
		QuanLiCanBo qlcb = new QuanLiCanBo(cb1);

		qlcb.run();
	}

}
