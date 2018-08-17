package com.hw.controller;

import com.hw.message.Message;
import com.hw.message.MessageType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/25 0025.
 */
@RestController
public class HwController {
    @RequestMapping(value = "/hw", method = RequestMethod.GET)
    public ResponseEntity<Message> getHw() {
        String res = "Hello World !";
        return new ResponseEntity<Message>(new Message(MessageType.MSG_TYPE_SUCCESS, (Object) res), HttpStatus.OK);
    }
}
