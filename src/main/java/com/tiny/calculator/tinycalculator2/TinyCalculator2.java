/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiny.calculator.tinycalculator2;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author borisdom
 */
@Named(value = "tinyCalculator2")
@SessionScoped
public class TinyCalculator2 implements Serializable{

    /**
     * Creates a new instance of TinyCalculator2
     */
    public TinyCalculator2() {
       LOGGER.log(Level.INFO, "ctor TinyCalculator2");
    }
    
    private double _param1;
    private double _param2;
    private double _result;
    
    private static final Logger LOGGER = Logger.getLogger("TinyCalculator2");
    
    

    public double getParam1() {
        return _param1;
    }

    public void setParam1(double _param1) {
        this._param1 = _param1;
    }

    public double getParam2() {
        return _param2;
    }

    public void setParam2(double _param2) {
        this._param2 = _param2;
    }

    public double getResult() {
        return _result;
    }

    public void setResult(double _result) {
        this._result = _result;
    }

    public String add() {
        _result = _param1 + _param2;
        return "";
    }

    public String subtract() {
        _result = _param1 - _param2;
        return "";
    }

    public String multiply() {
        _result = _param1 * _param2;
        return "";
    }

    public String divide() {
        _result = _param1 / _param2;
        return "";
    }
    
}
