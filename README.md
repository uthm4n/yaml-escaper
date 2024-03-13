# yaml-escaper
To ensure that YAML is formatted correctly when pasting as a string into a JSON payload sent to the Morpheus API.

## Setup:
1. Create a Groovy Script task under Library > Automation > Tasks
2. Paste in the code from `yaml-escape.groovy`
3. Create a new cypher (Tools > Cypher) and paste in your yaml payload (e.g. contents of a kubeconfig file). Ensure that the cypher is named 'secret/kubeconfig' (update this as well as the reference in the code as needed)
4. Run the task 
