/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author Charles Antunes
 */
public class TaskController {

    public void save(Task task) {

    }

    public void update(Task task) {

    }

    public void remobeById(int taskId) throws SQLException {
String sql = "DELETE FROM tasks WHERE id = ?";
Connection conn = null;
PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
statement = conn.prepareStatement(sql);
statement.setInt(1, taskId);
statement.execute();
        } catch (SQLException e) {
throw new SQLException("Erro ao deletar a tarefa");
        } finally{
ConnectionFactory.closeConnection(conn);
}
    }

    public List<Task> gatAll(int idProject) {
        return null;
    }
}
