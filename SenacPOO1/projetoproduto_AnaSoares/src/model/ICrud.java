package model;

import java.util.ArrayList;

public interface ICrud {
    boolean insert(Object object);
    boolean update(Object object);
    boolean delete(Object object);
    ArrayList<Object> select(Object object);

}