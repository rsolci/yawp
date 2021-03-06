package io.yawp.servlet.hierarchy;

import io.yawp.commons.utils.ServletTestCase;
import io.yawp.repository.models.hierarchy.ObjectSubClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HierarchyTransformerTest extends ServletTestCase {

    @Test
    public void testSuperClassTransformer() {
        post("/hierarchy_subclasses/1", "{ name: 'john' }");

        String json = get("/hierarchy_subclasses/1", params("t", "upperCase"));
        ObjectSubClass object = from(json, ObjectSubClass.class);

        assertEquals("JOHN", object.getName());
    }

    @Test
    public void testAllObjectsTransformer() {
        post("/hierarchy_subclasses/1", "{ name: 'john' }");

        String json = get("/hierarchy_subclasses/1", params("t", "allObjectsUpperCase"));
        ObjectSubClass object = from(json, ObjectSubClass.class);

        assertEquals("JOHN", object.getName());
    }

}
