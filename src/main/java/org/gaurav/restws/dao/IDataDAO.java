package org.gaurav.restws.dao;

public interface IDataDAO<T1> {
	public T1 read(long id);

	public int insert(T1 t);

	public int delete(long id);

	public int update(T1 t);

}
