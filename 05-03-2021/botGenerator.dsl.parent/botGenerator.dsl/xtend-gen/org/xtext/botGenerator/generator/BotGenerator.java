/**
 * generated by Xtext 2.19.0
 */
package org.xtext.botGenerator.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BotGenerator extends AbstractGenerator {
  public static final int REGEX = 0;
  
  public static final int SIMPLE = 1;
  
  public static final int COMPOSITE = 2;
  
  public static final int TRAINING = 3;
  
  private static boolean isPlugin = true;
  
  private static String newpath;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nZip cannot be resolved."
      + "\nZip cannot be resolved."
      + "\nThe method doGenerate(Resource, IFileSystemAccess2, IGeneratorContext, Zip) from the type DialogflowGenerator refers to the missing type Zip"
      + "\nThe method doGenerate(Resource, IFileSystemAccess2, IGeneratorContext, Zip) from the type RasaGenerator refers to the missing type Object");
  }
  
  public static int entityType(final /* Entity */Object entity) {
    throw new Error("Unresolved compilation problems:"
      + "\nRegexInput cannot be resolved to a type."
      + "\nSimpleInput cannot be resolved to a type."
      + "\n!== cannot be resolved"
      + "\ninputs cannot be resolved"
      + "\nget cannot be resolved"
      + "\ninputs cannot be resolved"
      + "\nget cannot be resolved"
      + "\ninputs cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  public static boolean setIsPlugin(final boolean value) {
    return BotGenerator.isPlugin = value;
  }
  
  public static String newPath(final String path) {
    String _xblockexpression = null;
    {
      BotGenerator.isPlugin = false;
      _xblockexpression = BotGenerator.newpath = path;
    }
    return _xblockexpression;
  }
  
  public static int intentType(final /* Intent */Object intent) {
    throw new Error("Unresolved compilation problems:"
      + "\nRegexInput cannot be resolved to a type."
      + "\ninputs cannot be resolved"
      + "\nget cannot be resolved"
      + "\ninputs cannot be resolved"
      + "\nget cannot be resolved");
  }
}
