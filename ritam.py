import sys

# Check if a command line argument was provided for the suite name
if len(sys.argv) < 2:
    print("Please provide a suite name as a command line argument.")
    sys.exit(1)

suite_name = sys.argv[1]

config = f"""
version: 0.2
globalTimeout: 150
testSuiteTimeout: 150
testSuiteStep: 150

runson: win

autosplit: false
retryOnFailure: false
tunnelNames: ['GuidewireTunnel']
#tunnel: true

maxRetries: 1
concurrency: 5

# shell: bash

env:
  CACHE_DIR: m2_cache_dir

cacheKey: '{{ checksum "pom.xml" }}'
cacheDirectories:
  - $CACHE_DIR

pre:
  - mvn -Dmaven.repo.local=./.m2 dependency:resolve

framework:
  name: maven/testng
  defaultReports: false
  discoveryType: method
  flags: ["-Dtestngxml={suite_name}", "-Plocal"]

report: true

partialReports:
  frameworkName: testng
  location: target/surefire-reports/
  type: html

runtime:
  language: java
  version: "11"

jobLabel: [GW_RP_Hyperexecute, {suite_name}]
"""

with open("ritam.yaml", "w") as file:
    file.write(config)
print("File is generated -----------------------------------------------------------------------------------")
