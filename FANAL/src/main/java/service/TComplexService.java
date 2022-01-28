package service;

import model.TComplex;

import java.sql.SQLException;
import java.util.List;

public interface TComplexService {
    public void insert(TComplex tComplex) throws SQLException;

    public TComplex select(int id);

    public List<TComplex> selectAll() throws SQLException;

    public boolean delete(int id) throws SQLException;

    public boolean update(TComplex tComplex) throws SQLException;
}
