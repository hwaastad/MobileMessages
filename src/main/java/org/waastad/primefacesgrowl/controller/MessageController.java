/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.primefacesgrowl.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.extern.slf4j.Slf4j;
import org.omnifaces.util.Messages;

/**
 *
 * @author Helge Waastad <helge.waastad@waastad.org>
 */
@Named
@SessionScoped
@Slf4j
public class MessageController implements Serializable {
    private static final long serialVersionUID = 4460470331582972205L;

    public String addMessage() {
        log.info("Adding message");
        Messages.addFlashGlobalInfo("A Flash message");
        return "pm:second";
    }
}
