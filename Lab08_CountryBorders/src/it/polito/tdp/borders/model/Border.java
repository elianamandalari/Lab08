package it.polito.tdp.borders.model;

public class Border {
	int cod1;
	int cod2;
public Border(int int1, int int2) {
		this.cod1=int1;
		this.cod2=int2;
	}
public int getCod1() {
	return cod1;
}
public void setCod1(int cod1) {
	this.cod1 = cod1;
}
public int getCod2() {
	return cod2;
}
public void setCod2(int cod2) {
	this.cod2 = cod2;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + cod1;
	result = prime * result + cod2;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Border other = (Border) obj;
	if (cod1 != other.cod1)
		return false;
	if (cod2 != other.cod2)
		return false;
	return true;
}
@Override
public String toString() {
	return "Border [cod1=" + cod1 + ", cod2=" + cod2 + "]";
}






}
