/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import static com.jayway.restassured.RestAssured.when;
import com.jayway.restassured.parsing.Parser;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
//import com.jayway.restassured.RestAssured.Parser;


/**
 *
 * @author Andreas
 */
public class JUnitTest {
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        baseURI = "http://localhost:8080";
        defaultParser = Parser.JSON;
        basePath = "ExamPrep/api/";
    }
    
    

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetUser() {
        when()
                .get("users/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
    
    


}
