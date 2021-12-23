package com.advait.spring.CoreSpring.refTypes;

public class Student {

	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}

	private Scores score;

	public Scores getScore() {
		return score;
	}

	public void setScore(Scores score) {
		this.score = score;
	}
}
