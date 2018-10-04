package com.myorg

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import junit.framework.TestCase.assertEquals
import org.junit.Test
import software.amazon.awscdk.App
import java.io.IOException

class HelloStackTest {

    @Test
    @Throws(IOException::class)
    fun testStack() {
        val app = App()
        val stack = HelloStack(app, "test")

        val JSON = ObjectMapper()
                .configure(SerializationFeature.INDENT_OUTPUT, true)

        // synthesize the stack to a CloudFormation template and compare against
        // a checked-in JSON file.
        val actual = JSON.valueToTree<JsonNode>(app.synthesizeStack(stack.name).template)
        val expected = JSON.readTree(javaClass.getResource("expected.cfn.json"))

        println(actual)

        assertEquals(expected, actual)
    }

}
