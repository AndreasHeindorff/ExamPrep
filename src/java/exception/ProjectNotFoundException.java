/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Andreas
 */
public class ProjectNotFoundException extends Exception {

    public ProjectNotFoundException(String no_project_with_that_id) {
    super(no_project_with_that_id);
    }
}
