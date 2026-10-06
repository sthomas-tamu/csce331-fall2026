Javadoc auto generates documentation based on @ comments in the code.

# About
It is included as part of the Java Development Kit (JDK). Once JDK is installed, the javadoc command-line tool will also be available.

Popular tags:
  @author
  @param
  @returns
  @throws

Full list of tags: https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html

# Running Javadoc
From the command line, use the javadoc command followed by various options and the source files or packages to be documented.

## Basic usage
Navigate to your project's root directory in the command terminal. This is typically the directory containing your top-level package folders.

Run the javadoc command with the -d option to specify the destination directory for the generated HTML documentation, and then list the packages or source files:

> javadoc -d [path_to_javadoc_destination_directory] [package_name(s)_or_source_file(s)]

After running the command, navigate to the specified destination directory and open index.html in a web browser to view the generated documentation.

## For a single package

> javadoc -d C:\javadoc\myproject com.example.mypackage

## For multiple packages
> javadoc -d C:\javadoc\myproject com.example.package1 com.example.package2

## For specific source files

> javadoc -d C:\javadoc\myproject C:\projects\com\example\mypackage\MyClass.java

## Advanced Usage with sourcepath
If you are running the javadoc command from a directory other than your project's root, you need to specify the source path using the -sourcepath option.

> javadoc -d [path_to_javadoc_destination_directory] -sourcepath [path_to_package_root_directory] [package_name(s)_or_source_file(s)]

## Commonly Used Options:
- -d <directory>: Specifies the destination directory where Javadoc generates the HTML files.
- -sourcepath <pathlist>: Specifies the source code path for finding .java files.
- -subpackages <package1>:<package2>...: Generates documentation for the specified packages and all their subpackages.
- -public, -protected, -package, -private: Control the level of access for which members are included in the documentation.
- -version: Includes the @version tag in the generated documentation.
- -author: Includes the @author tag in the generated documentation.
- -link <url>: Creates links to Javadoc-generated documentation for externally referenced classes.
- -verbose: Provides more detailed messages during the Javadoc generation process.
