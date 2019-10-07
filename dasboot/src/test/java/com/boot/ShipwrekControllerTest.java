package com.boot;


import com.boot.controller.ShipwrekController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import org.junit.Assert;

public class ShipwrekControllerTest {

    @InjectMocks
    private ShipwrekController sc;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet(){
        Shipwreck sw = new Shipwreck();
        sw.setId(1l);
        when((Shipwreck)shipwreckRepository.findById(1l).get()).thenReturn(sw);//Test case not working looks like typecasting issue.

        Shipwreck wreck = sc.getShipwreck(1l);
        Assert.assertEquals(1l, wreck.getId().longValue());
    }
}
