import static org.junit.Assert.*;
import com.nhaarman.mockitokotlin2.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

#parse("File Header.java")
public class ${NAME} 
  ${CLASS_NAME} subject;
  
  @Before
  void install(){
    subject = new ${CLASS_NAME}()
  } 
  ${BODY}
}