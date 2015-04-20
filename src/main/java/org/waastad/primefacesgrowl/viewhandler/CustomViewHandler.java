/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.primefacesgrowl.viewhandler;

import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.context.FacesContext;
import lombok.extern.slf4j.Slf4j;
import org.omnifaces.util.Faces;
import org.primefaces.mobile.renderkit.MobileRenderKit;

/**
 *
 * @author Helge Waastad <helge.waastad@waastad.org>
 */
@Slf4j
public class CustomViewHandler extends ViewHandlerWrapper {

    private final ViewHandler wrapped;
    
    public CustomViewHandler(ViewHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public ViewHandler getWrapped() {
        return this.wrapped;
    }

    @Override
    public String calculateRenderKitId(FacesContext context) {
        Faces.setContext(context);
        return MobileRenderKit.RENDER_KIT_ID;
//        if (path.contains("mobile")) {
//            if (log.isDebugEnabled()) {
//                log.debug("Going Mobile {}", MobileRenderKit.RENDER_KIT_ID);
//            }
//            return MobileRenderKit.RENDER_KIT_ID;
//        } else {
//            if (log.isDebugEnabled()) {
//                log.debug("Going Laptop {}", this.wrapped.calculateRenderKitId(context));
//            }
//            return this.wrapped.calculateRenderKitId(context);
//        }
    }

}
