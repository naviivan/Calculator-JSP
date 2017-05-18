package it.ivan.dao;

import javax.ejb.Local;

@Local
public interface CalcLocal {
	public int add(int x, int y);
	public int sott(int x, int y);
	public int molt(int x, int y);
	public int div(int x, int y);
}
