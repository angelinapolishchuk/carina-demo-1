package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.DeleteUserMethod;
import com.qaprosoft.carina.demo.api.GetUserMethods;
import com.qaprosoft.carina.demo.api.PostUserMethod;
import com.qaprosoft.carina.demo.api.UpdateUserMethod;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class ApiTest implements IAbstractTest {
    @Test()
    @MethodOwner(owner = "apolishchuk")
    public void testGetUsers() {
        GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.callAPIExpectSuccess();
    }

    @Test()
    @MethodOwner(owner = "apolishchuk")
    public void testCreateUsers() {
        PostUserMethod postUsersMethods = new PostUserMethod();
        postUsersMethods.callAPIExpectSuccess();
    }

    @Test()
    @MethodOwner(owner = "apolishchuk")
    public void testUpdateUsers() {
        UpdateUserMethod updateUserMethod = new UpdateUserMethod();
        updateUserMethod.callAPIExpectSuccess();
    }

    @Test()
    @MethodOwner(owner = "apolishchuk")
    public void testDeleteUsers() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod();
        deleteUserMethod.callAPIExpectSuccess();
    }

}