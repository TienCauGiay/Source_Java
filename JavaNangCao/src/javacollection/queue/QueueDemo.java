package javacollection.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// Queue : hàng đợi, Các phần tử được sắp xếp theo hàng, vào trước ra trước
// Các phần tử trong queue k là duy nhất
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		queue.add("a");
		queue.add("b");
		queue.add("d");
		queue.add("e");
		queue.add("c");
		queue.add("f");
		queue.add("a");

		for (String string : queue) {
			System.out.println(string);
		}

		queue.remove();

		System.out.println("Sau khi xóa: ");
		for (String string : queue) {
			System.out.println(string);
		}
	}
}
