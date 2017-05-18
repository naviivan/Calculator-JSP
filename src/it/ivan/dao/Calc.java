package it.ivan.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calc
 */
@Stateless
@LocalBean
public class Calc implements CalcLocal {

    /**
     * Default constructor. 
     */
    public Calc() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sott(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int molt(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}

}
