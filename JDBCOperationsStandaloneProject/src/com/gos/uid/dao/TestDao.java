package com.gos.uid.dao;

import com.gos.uid.model.TestTable;

import java.util.List;

public interface TestDao {

    public List<TestTable> getTestTableData();

    public int insertTestTableData(TestTable testTable);

    public int updateTestTableData(int column1, String column2);

    public int deleteTestTableData(int column1);

}
