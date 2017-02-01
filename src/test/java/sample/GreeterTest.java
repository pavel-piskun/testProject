package sample;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

/**
 * Created by Pavel on 2/1/2017.
 */
@RunWith(Arquillian.class)
public class GreeterTest {
    @Inject
    Greeter greeter;


    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
                .addClass(Greeter.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(jar.toString(true));
        return jar;
    }

    @Test
    public void sayHelloTest() {
        Assert.assertEquals("Hello, Earthling!",
                greeter.sayHello("Earthling"));
        greeter.greet(System.out, "Earthling");
    }

}
