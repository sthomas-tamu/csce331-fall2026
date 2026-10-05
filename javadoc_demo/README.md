Javadoc auto generates documentation based on @ comments in the code.

Popular tags:
  @author
  @param
  @returns
  @throws

Full list of tags: https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html

Build documentation with javadoc to create documentation in doc/ of src/:
(if doc/ does not exist, it will create it)

> javadoc -d docs -sourcepath ./ src
