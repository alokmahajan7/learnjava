package com.alok.org;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes("com.alok.org.TestAnnotation")
public class TestAnnotationConsumer extends AbstractProcessor {
//    @Override
//    public synchronized void init(ProcessingEnvironment env) {
//        // Initialize the processor
//    }
    @Override
    public boolean process(Set<? extends TypeElement> set,
                           RoundEnvironment roundEnv) {
    	Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(TestAnnotation.class);
        for(Element e : elements){
            if(!e.getClass().equals(String.class)){
                processingEnv.getMessager().printMessage(Kind.ERROR,
                     "@TestAnnotation annotated fields must be of type StringType", e);
            }
        }
        return true;
    }
//    @Override
//    public Set<String> getSupportedAnnotationTypes() {
//        // Return the set of annotations supported
//    }
//    @Override
//    public SourceVersion getSupportedSourceVersion() {
//        // Return the Java version supported
//    }
}