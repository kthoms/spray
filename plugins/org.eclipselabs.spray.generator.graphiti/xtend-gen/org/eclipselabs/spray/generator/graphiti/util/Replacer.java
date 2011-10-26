package org.eclipselabs.spray.generator.graphiti.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class Replacer {
  private Map<String,Function1<String,String>> replacements;
  
  public Function1<String,String> addReplacement(final String marker, final Function1<String,String> replacement) {
    Function1<String,String> _xblockexpression = null;
    {
      boolean _operator_equals = ObjectExtensions.operator_equals(replacement, null);
      if (_operator_equals) {
        {
          InputOutput.<String>println("Replacer ERROR: need to call initalizeReplacement() first");
          return null;
        }
      }
      Function1<String,String> _put = this.replacements.put(marker, replacement);
      _xblockexpression = (_put);
    }
    return _xblockexpression;
  }
  
  public Map<String,Function1<String,String>> initalizeReplacement() {
    HashMap<String,Function1<String,String>> _hashMap = new HashMap<String,Function1<String,String>>();
    Map<String,Function1<String,String>> _replacements = this.replacements = _hashMap;
    return _replacements;
  }
  
  public void execute(final String input) {
      String result = input;
      Set<Entry<String,Function1<String,String>>> _entrySet = this.replacements.entrySet();
      for (final Entry<String,Function1<String,String>> replacement : _entrySet) {
        Function1<String,String> _value = replacement.getValue();
        String _apply = _value.apply(result);
        result = _apply;
      }
  }
}
