// Generated by GraphWalker (http://www.graphwalker.org)
package scanflow.target.generated-resources.graphwalker.org.myorg.testautomation;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "org/myorg/testautomation/Scanflow.graphml")
public interface Scanflow {

    @Vertex()
    void v_ClientNotRunning();

    @Edge()
    void e_ToggleRememberMe();

    @Edge()
    void e_ValidPremiumCredentials();

    @Vertex()
    void v_Browse();

    @Edge()
    void e_Logout();

    @Vertex()
    void v_LoginPrompted();

    @Edge()
    void e_StartClient();

    @Edge()
    void e_Close();

    @Edge()
    void e_Init();

    @Edge()
    void e_Exit();

    @Edge()
    void e_InvalidCredentials();
}
