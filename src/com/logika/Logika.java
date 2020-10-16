package com.logika;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk menampilkan logika true atau false memakai
	operator relasi and, or, not dan not and
 */
public class Logika {

    public static void main(String[] args) {
	    boolean a = true;
	    boolean b = false;

	    System.out.println("a && b = " + (a && b)); //false and
	    System.out.println("a || b = " + (a || b)); //true or
	    System.out.println("!a = "+!a); //false not
	    System.out.println("!(a && b) = "+!(a && b)); //true not and
    }
}
