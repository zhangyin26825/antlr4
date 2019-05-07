// Generated from java.g4 by ANTLR 4.7.2

package com.zhangyin.java;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaParser}.
 */
public interface javaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(javaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(javaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(javaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(javaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(javaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(javaParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(javaParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(javaParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(javaParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(javaParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(javaParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(javaParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(javaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(javaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(javaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(javaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(javaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(javaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(javaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(javaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(javaParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(javaParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(javaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(javaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(javaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(javaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(javaParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(javaParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(javaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(javaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(javaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(javaParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(javaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(javaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(javaParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(javaParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(javaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(javaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(javaParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(javaParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(javaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(javaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(javaParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(javaParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(javaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(javaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(javaParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(javaParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(javaParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(javaParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(javaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(javaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(javaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(javaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(javaParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(javaParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(javaParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(javaParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(javaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(javaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(javaParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(javaParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(javaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(javaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(javaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(javaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(javaParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(javaParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(javaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(javaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(javaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(javaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(javaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(javaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(javaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(javaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(javaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(javaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(javaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(javaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(javaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(javaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(javaParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(javaParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(javaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(javaParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(javaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(javaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(javaParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(javaParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(javaParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(javaParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(javaParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(javaParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(javaParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(javaParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(javaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(javaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(javaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(javaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(javaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(javaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(javaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(javaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(javaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(javaParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(javaParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(javaParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(javaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(javaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(javaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(javaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(javaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(javaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(javaParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(javaParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(javaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(javaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(javaParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(javaParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(javaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(javaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(javaParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(javaParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(javaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(javaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(javaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(javaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(javaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(javaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(javaParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(javaParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(javaParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(javaParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(javaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(javaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(javaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(javaParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(javaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(javaParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(javaParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(javaParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(javaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(javaParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(javaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(javaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(javaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(javaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(javaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(javaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(javaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(javaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(javaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(javaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(javaParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(javaParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(javaParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(javaParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(javaParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(javaParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(javaParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(javaParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(javaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(javaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(javaParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(javaParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(javaParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(javaParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(javaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(javaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(javaParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(javaParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(javaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(javaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(javaParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(javaParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(javaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(javaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(javaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(javaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(javaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(javaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(javaParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(javaParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(javaParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(javaParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(javaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(javaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(javaParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(javaParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(javaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(javaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(javaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(javaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(javaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(javaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(javaParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(javaParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(javaParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(javaParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(javaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(javaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(javaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(javaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(javaParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(javaParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(javaParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(javaParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(javaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(javaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(javaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(javaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(javaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(javaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(javaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(javaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(javaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(javaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(javaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(javaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(javaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(javaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(javaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(javaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(javaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(javaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(javaParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(javaParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(javaParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(javaParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(javaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(javaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(javaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(javaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(javaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(javaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(javaParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(javaParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(javaParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(javaParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(javaParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(javaParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(javaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(javaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(javaParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(javaParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(javaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(javaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(javaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(javaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(javaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(javaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(javaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(javaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(javaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(javaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(javaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(javaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(javaParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(javaParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(javaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(javaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(javaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(javaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(javaParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(javaParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(javaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(javaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(javaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(javaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(javaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(javaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(javaParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(javaParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(javaParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(javaParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(javaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(javaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(javaParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(javaParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(javaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(javaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(javaParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(javaParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(javaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(javaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(javaParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(javaParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(javaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(javaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(javaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(javaParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(javaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(javaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(javaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(javaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(javaParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(javaParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(javaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(javaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(javaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(javaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(javaParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(javaParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(javaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(javaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(javaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(javaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(javaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(javaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(javaParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(javaParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(javaParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(javaParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(javaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(javaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(javaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(javaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(javaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(javaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(javaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(javaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(javaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(javaParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(javaParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(javaParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(javaParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(javaParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(javaParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(javaParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(javaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(javaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(javaParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(javaParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(javaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(javaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(javaParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(javaParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(javaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(javaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(javaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(javaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(javaParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(javaParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(javaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(javaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(javaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(javaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(javaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(javaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(javaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(javaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(javaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(javaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(javaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(javaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(javaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(javaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(javaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(javaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(javaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(javaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(javaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(javaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(javaParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(javaParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(javaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(javaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(javaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(javaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(javaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(javaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(javaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(javaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(javaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(javaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(javaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(javaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(javaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(javaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(javaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(javaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(javaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(javaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(javaParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(javaParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(javaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(javaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(javaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(javaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(javaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(javaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(javaParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(javaParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(javaParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(javaParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(javaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(javaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(javaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(javaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(javaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(javaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(javaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(javaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(javaParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(javaParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(javaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(javaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(javaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(javaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(javaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(javaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(javaParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(javaParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(javaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(javaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(javaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(javaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(javaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(javaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(javaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(javaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(javaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(javaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(javaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(javaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(javaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(javaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(javaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(javaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(javaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(javaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(javaParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(javaParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(javaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(javaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(javaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(javaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(javaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(javaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(javaParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(javaParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(javaParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(javaParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(javaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(javaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(javaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(javaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(javaParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(javaParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(javaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(javaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(javaParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(javaParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(javaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(javaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(javaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(javaParser.CastExpressionContext ctx);
}