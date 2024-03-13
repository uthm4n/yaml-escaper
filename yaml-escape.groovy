import groovy.json.StringEscapeUtils
 
def String yaml = """
${cypher.read('secret/kubeconfig')}                                    // name of the cypher entry that contains the yaml payload
"""
 
def escape(yaml) {
    StringEscapeUtils stringEscape = new StringEscapeUtils()
    String escapedYaml = stringEscape.escapeJava(yaml)
    return escapedYaml
}
 
println(escape(yaml))
