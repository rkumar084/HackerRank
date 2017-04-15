package com.hackerrank.algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/jim-and-the-orders
public class JimOrders {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		List<Order> orders = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			int startTime = in.nextInt();
			int delay = in.nextInt();
			//int totalDelay = startTime + delay;
			orders.add(new Order(i + 1, startTime, delay));
		}

		Collections.sort(orders);
		boolean first = true;
		StringBuilder result = new StringBuilder();
		for (Order order : orders) {
			if (first) {
				first = false;
			} else {
				result.append(" ");
			}
			result.append(order.getOrderIndex());
		}
		System.out.println(result.toString());
	}

	private static class Order implements Comparable<Order> {
		int orderIndex;
		int time;
		int delay;
		int totaltime;

		public Order(int orderIndex, int time, int delay) {
			this.orderIndex = orderIndex;
			this.time = time;
			this.delay = delay;
			totaltime = this.time + this.delay;
		}

		public int getOrderIndex() {
			return orderIndex;
		}

		@Override
		public int compareTo(Order order) {

			if (this.totaltime == order.totaltime)
				return 0;
			else if (this.totaltime > order.totaltime)
				return 1;
			else
				return -1;
		}

	}

}
