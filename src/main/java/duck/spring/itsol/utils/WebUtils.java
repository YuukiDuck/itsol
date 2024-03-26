<<<<<<< HEAD
package duck.spring.itsol.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class WebUtils {
    public static HttpServletRequest getCurrentRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
    }
}
=======
//package duck.spring.itsol.utils;
//
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//public class WebUtils {
//    public static HttpServletRequest getCurrentRequest() {
//        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
//    }
//}
>>>>>>> 5e37fb11d587543ea3407f4acfb082ec00170d9c
