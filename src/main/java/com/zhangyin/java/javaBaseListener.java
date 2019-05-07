// Generated from java.g4 by ANTLR 4.7.2

package com.zhangyin.java;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link javaListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class javaBaseListener implements javaListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLiteral(javaParser.LiteralContext ctx) {
		System.out.println(ctx.getText());

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLiteral(javaParser.LiteralContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimitiveType(javaParser.PrimitiveTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimitiveType(javaParser.PrimitiveTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNumericType(javaParser.NumericTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumericType(javaParser.NumericTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIntegralType(javaParser.IntegralTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIntegralType(javaParser.IntegralTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFloatingPointType(javaParser.FloatingPointTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFloatingPointType(javaParser.FloatingPointTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReferenceType(javaParser.ReferenceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReferenceType(javaParser.ReferenceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassOrInterfaceType(javaParser.ClassOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassOrInterfaceType(javaParser.ClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassType(javaParser.ClassTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassType(javaParser.ClassTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassType_lf_classOrInterfaceType(javaParser.ClassType_lf_classOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassType_lf_classOrInterfaceType(javaParser.ClassType_lf_classOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassType_lfno_classOrInterfaceType(javaParser.ClassType_lfno_classOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassType_lfno_classOrInterfaceType(javaParser.ClassType_lfno_classOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceType(javaParser.InterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceType(javaParser.InterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceType_lf_classOrInterfaceType(javaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceType_lf_classOrInterfaceType(javaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceType_lfno_classOrInterfaceType(javaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceType_lfno_classOrInterfaceType(javaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeVariable(javaParser.TypeVariableContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeVariable(javaParser.TypeVariableContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayType(javaParser.ArrayTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayType(javaParser.ArrayTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDims(javaParser.DimsContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDims(javaParser.DimsContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeParameter(javaParser.TypeParameterContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeParameter(javaParser.TypeParameterContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeParameterModifier(javaParser.TypeParameterModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeParameterModifier(javaParser.TypeParameterModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeBound(javaParser.TypeBoundContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeBound(javaParser.TypeBoundContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAdditionalBound(javaParser.AdditionalBoundContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdditionalBound(javaParser.AdditionalBoundContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeArguments(javaParser.TypeArgumentsContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeArguments(javaParser.TypeArgumentsContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeArgumentList(javaParser.TypeArgumentListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeArgumentList(javaParser.TypeArgumentListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeArgument(javaParser.TypeArgumentContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeArgument(javaParser.TypeArgumentContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWildcard(javaParser.WildcardContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWildcard(javaParser.WildcardContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWildcardBounds(javaParser.WildcardBoundsContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWildcardBounds(javaParser.WildcardBoundsContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPackageName(javaParser.PackageNameContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPackageName(javaParser.PackageNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeName(javaParser.TypeNameContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeName(javaParser.TypeNameContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPackageOrTypeName(javaParser.PackageOrTypeNameContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPackageOrTypeName(javaParser.PackageOrTypeNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpressionName(javaParser.ExpressionNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpressionName(javaParser.ExpressionNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodName(javaParser.MethodNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodName(javaParser.MethodNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAmbiguousName(javaParser.AmbiguousNameContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAmbiguousName(javaParser.AmbiguousNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompilationUnit(javaParser.CompilationUnitContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompilationUnit(javaParser.CompilationUnitContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPackageDeclaration(javaParser.PackageDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPackageDeclaration(javaParser.PackageDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPackageModifier(javaParser.PackageModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPackageModifier(javaParser.PackageModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterImportDeclaration(javaParser.ImportDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImportDeclaration(javaParser.ImportDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSingleTypeImportDeclaration(javaParser.SingleTypeImportDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSingleTypeImportDeclaration(javaParser.SingleTypeImportDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeImportOnDemandDeclaration(javaParser.TypeImportOnDemandDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeImportOnDemandDeclaration(javaParser.TypeImportOnDemandDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSingleStaticImportDeclaration(javaParser.SingleStaticImportDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSingleStaticImportDeclaration(javaParser.SingleStaticImportDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStaticImportOnDemandDeclaration(javaParser.StaticImportOnDemandDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStaticImportOnDemandDeclaration(javaParser.StaticImportOnDemandDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeDeclaration(javaParser.TypeDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeDeclaration(javaParser.TypeDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassDeclaration(javaParser.ClassDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassDeclaration(javaParser.ClassDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNormalClassDeclaration(javaParser.NormalClassDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNormalClassDeclaration(javaParser.NormalClassDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassModifier(javaParser.ClassModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassModifier(javaParser.ClassModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeParameters(javaParser.TypeParametersContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeParameters(javaParser.TypeParametersContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeParameterList(javaParser.TypeParameterListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeParameterList(javaParser.TypeParameterListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSuperclass(javaParser.SuperclassContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSuperclass(javaParser.SuperclassContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSuperinterfaces(javaParser.SuperinterfacesContext ctx) {System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSuperinterfaces(javaParser.SuperinterfacesContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceTypeList(javaParser.InterfaceTypeListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceTypeList(javaParser.InterfaceTypeListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassBody(javaParser.ClassBodyContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassBody(javaParser.ClassBodyContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassBodyDeclaration(javaParser.ClassBodyDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassBodyDeclaration(javaParser.ClassBodyDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassMemberDeclaration(javaParser.ClassMemberDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassMemberDeclaration(javaParser.ClassMemberDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFieldDeclaration(javaParser.FieldDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFieldDeclaration(javaParser.FieldDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFieldModifier(javaParser.FieldModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFieldModifier(javaParser.FieldModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclaratorList(javaParser.VariableDeclaratorListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclaratorList(javaParser.VariableDeclaratorListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclarator(javaParser.VariableDeclaratorContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclarator(javaParser.VariableDeclaratorContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclaratorId(javaParser.VariableDeclaratorIdContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclaratorId(javaParser.VariableDeclaratorIdContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableInitializer(javaParser.VariableInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableInitializer(javaParser.VariableInitializerContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannType(javaParser.UnannTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannType(javaParser.UnannTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannPrimitiveType(javaParser.UnannPrimitiveTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannPrimitiveType(javaParser.UnannPrimitiveTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannReferenceType(javaParser.UnannReferenceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannReferenceType(javaParser.UnannReferenceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannClassOrInterfaceType(javaParser.UnannClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannClassOrInterfaceType(javaParser.UnannClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannClassType(javaParser.UnannClassTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannClassType(javaParser.UnannClassTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannClassType_lf_unannClassOrInterfaceType(javaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannClassType_lf_unannClassOrInterfaceType(javaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannClassType_lfno_unannClassOrInterfaceType(javaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannClassType_lfno_unannClassOrInterfaceType(javaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannInterfaceType(javaParser.UnannInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannInterfaceType(javaParser.UnannInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannInterfaceType_lf_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(javaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannTypeVariable(javaParser.UnannTypeVariableContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannTypeVariable(javaParser.UnannTypeVariableContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnannArrayType(javaParser.UnannArrayTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnannArrayType(javaParser.UnannArrayTypeContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodDeclaration(javaParser.MethodDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodDeclaration(javaParser.MethodDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodModifier(javaParser.MethodModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodModifier(javaParser.MethodModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodHeader(javaParser.MethodHeaderContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodHeader(javaParser.MethodHeaderContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterResult(javaParser.ResultContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitResult(javaParser.ResultContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodDeclarator(javaParser.MethodDeclaratorContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodDeclarator(javaParser.MethodDeclaratorContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormalParameterList(javaParser.FormalParameterListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFormalParameterList(javaParser.FormalParameterListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormalParameters(javaParser.FormalParametersContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFormalParameters(javaParser.FormalParametersContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormalParameter(javaParser.FormalParameterContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFormalParameter(javaParser.FormalParameterContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableModifier(javaParser.VariableModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableModifier(javaParser.VariableModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLastFormalParameter(javaParser.LastFormalParameterContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLastFormalParameter(javaParser.LastFormalParameterContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReceiverParameter(javaParser.ReceiverParameterContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReceiverParameter(javaParser.ReceiverParameterContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterThrows_(javaParser.Throws_Context ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitThrows_(javaParser.Throws_Context ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExceptionTypeList(javaParser.ExceptionTypeListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExceptionTypeList(javaParser.ExceptionTypeListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExceptionType(javaParser.ExceptionTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExceptionType(javaParser.ExceptionTypeContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodBody(javaParser.MethodBodyContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodBody(javaParser.MethodBodyContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstanceInitializer(javaParser.InstanceInitializerContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstanceInitializer(javaParser.InstanceInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStaticInitializer(javaParser.StaticInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStaticInitializer(javaParser.StaticInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstructorDeclaration(javaParser.ConstructorDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstructorDeclaration(javaParser.ConstructorDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstructorModifier(javaParser.ConstructorModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstructorModifier(javaParser.ConstructorModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstructorDeclarator(javaParser.ConstructorDeclaratorContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstructorDeclarator(javaParser.ConstructorDeclaratorContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpleTypeName(javaParser.SimpleTypeNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpleTypeName(javaParser.SimpleTypeNameContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstructorBody(javaParser.ConstructorBodyContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstructorBody(javaParser.ConstructorBodyContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExplicitConstructorInvocation(javaParser.ExplicitConstructorInvocationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExplicitConstructorInvocation(javaParser.ExplicitConstructorInvocationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumDeclaration(javaParser.EnumDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumDeclaration(javaParser.EnumDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumBody(javaParser.EnumBodyContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumBody(javaParser.EnumBodyContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumConstantList(javaParser.EnumConstantListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumConstantList(javaParser.EnumConstantListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumConstant(javaParser.EnumConstantContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumConstant(javaParser.EnumConstantContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumConstantModifier(javaParser.EnumConstantModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumConstantModifier(javaParser.EnumConstantModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumBodyDeclarations(javaParser.EnumBodyDeclarationsContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumBodyDeclarations(javaParser.EnumBodyDeclarationsContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceDeclaration(javaParser.InterfaceDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceDeclaration(javaParser.InterfaceDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNormalInterfaceDeclaration(javaParser.NormalInterfaceDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNormalInterfaceDeclaration(javaParser.NormalInterfaceDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceModifier(javaParser.InterfaceModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceModifier(javaParser.InterfaceModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExtendsInterfaces(javaParser.ExtendsInterfacesContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExtendsInterfaces(javaParser.ExtendsInterfacesContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceBody(javaParser.InterfaceBodyContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceBody(javaParser.InterfaceBodyContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceMemberDeclaration(javaParser.InterfaceMemberDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceMemberDeclaration(javaParser.InterfaceMemberDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstantDeclaration(javaParser.ConstantDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstantDeclaration(javaParser.ConstantDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstantModifier(javaParser.ConstantModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstantModifier(javaParser.ConstantModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceMethodDeclaration(javaParser.InterfaceMethodDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceMethodDeclaration(javaParser.InterfaceMethodDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceMethodModifier(javaParser.InterfaceMethodModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceMethodModifier(javaParser.InterfaceMethodModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAnnotationTypeDeclaration(javaParser.AnnotationTypeDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAnnotationTypeDeclaration(javaParser.AnnotationTypeDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAnnotationTypeBody(javaParser.AnnotationTypeBodyContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAnnotationTypeBody(javaParser.AnnotationTypeBodyContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAnnotationTypeMemberDeclaration(javaParser.AnnotationTypeMemberDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAnnotationTypeMemberDeclaration(javaParser.AnnotationTypeMemberDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAnnotationTypeElementDeclaration(javaParser.AnnotationTypeElementDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAnnotationTypeElementDeclaration(javaParser.AnnotationTypeElementDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAnnotationTypeElementModifier(javaParser.AnnotationTypeElementModifierContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAnnotationTypeElementModifier(javaParser.AnnotationTypeElementModifierContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDefaultValue(javaParser.DefaultValueContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDefaultValue(javaParser.DefaultValueContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAnnotation(javaParser.AnnotationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAnnotation(javaParser.AnnotationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNormalAnnotation(javaParser.NormalAnnotationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNormalAnnotation(javaParser.NormalAnnotationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElementValuePairList(javaParser.ElementValuePairListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElementValuePairList(javaParser.ElementValuePairListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElementValuePair(javaParser.ElementValuePairContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElementValuePair(javaParser.ElementValuePairContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElementValue(javaParser.ElementValueContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElementValue(javaParser.ElementValueContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElementValueArrayInitializer(javaParser.ElementValueArrayInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElementValueArrayInitializer(javaParser.ElementValueArrayInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElementValueList(javaParser.ElementValueListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElementValueList(javaParser.ElementValueListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMarkerAnnotation(javaParser.MarkerAnnotationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMarkerAnnotation(javaParser.MarkerAnnotationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSingleElementAnnotation(javaParser.SingleElementAnnotationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSingleElementAnnotation(javaParser.SingleElementAnnotationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayInitializer(javaParser.ArrayInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayInitializer(javaParser.ArrayInitializerContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableInitializerList(javaParser.VariableInitializerListContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableInitializerList(javaParser.VariableInitializerListContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(javaParser.BlockContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(javaParser.BlockContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlockStatements(javaParser.BlockStatementsContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlockStatements(javaParser.BlockStatementsContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlockStatement(javaParser.BlockStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlockStatement(javaParser.BlockStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLocalVariableDeclarationStatement(javaParser.LocalVariableDeclarationStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLocalVariableDeclarationStatement(javaParser.LocalVariableDeclarationStatementContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLocalVariableDeclaration(javaParser.LocalVariableDeclarationContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLocalVariableDeclaration(javaParser.LocalVariableDeclarationContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(javaParser.StatementContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(javaParser.StatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatementNoShortIf(javaParser.StatementNoShortIfContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatementNoShortIf(javaParser.StatementNoShortIfContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatementWithoutTrailingSubstatement(javaParser.StatementWithoutTrailingSubstatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatementWithoutTrailingSubstatement(javaParser.StatementWithoutTrailingSubstatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEmptyStatement(javaParser.EmptyStatementContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEmptyStatement(javaParser.EmptyStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLabeledStatement(javaParser.LabeledStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLabeledStatement(javaParser.LabeledStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLabeledStatementNoShortIf(javaParser.LabeledStatementNoShortIfContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLabeledStatementNoShortIf(javaParser.LabeledStatementNoShortIfContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpressionStatement(javaParser.ExpressionStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpressionStatement(javaParser.ExpressionStatementContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatementExpression(javaParser.StatementExpressionContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatementExpression(javaParser.StatementExpressionContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfThenStatement(javaParser.IfThenStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfThenStatement(javaParser.IfThenStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfThenElseStatement(javaParser.IfThenElseStatementContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfThenElseStatement(javaParser.IfThenElseStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfThenElseStatementNoShortIf(javaParser.IfThenElseStatementNoShortIfContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfThenElseStatementNoShortIf(javaParser.IfThenElseStatementNoShortIfContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssertStatement(javaParser.AssertStatementContext ctx) { System.out.println(ctx.getText());}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssertStatement(javaParser.AssertStatementContext ctx) {System.out.println(ctx.getText()); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitchStatement(javaParser.SwitchStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitchStatement(javaParser.SwitchStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitchBlock(javaParser.SwitchBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitchBlock(javaParser.SwitchBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitchBlockStatementGroup(javaParser.SwitchBlockStatementGroupContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitchBlockStatementGroup(javaParser.SwitchBlockStatementGroupContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitchLabels(javaParser.SwitchLabelsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitchLabels(javaParser.SwitchLabelsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitchLabel(javaParser.SwitchLabelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitchLabel(javaParser.SwitchLabelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumConstantName(javaParser.EnumConstantNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumConstantName(javaParser.EnumConstantNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileStatement(javaParser.WhileStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileStatement(javaParser.WhileStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileStatementNoShortIf(javaParser.WhileStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileStatementNoShortIf(javaParser.WhileStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoStatement(javaParser.DoStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoStatement(javaParser.DoStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForStatement(javaParser.ForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForStatement(javaParser.ForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForStatementNoShortIf(javaParser.ForStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForStatementNoShortIf(javaParser.ForStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBasicForStatement(javaParser.BasicForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBasicForStatement(javaParser.BasicForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBasicForStatementNoShortIf(javaParser.BasicForStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBasicForStatementNoShortIf(javaParser.BasicForStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForInit(javaParser.ForInitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForInit(javaParser.ForInitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForUpdate(javaParser.ForUpdateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForUpdate(javaParser.ForUpdateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatementExpressionList(javaParser.StatementExpressionListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatementExpressionList(javaParser.StatementExpressionListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnhancedForStatement(javaParser.EnhancedForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnhancedForStatement(javaParser.EnhancedForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnhancedForStatementNoShortIf(javaParser.EnhancedForStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnhancedForStatementNoShortIf(javaParser.EnhancedForStatementNoShortIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBreakStatement(javaParser.BreakStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBreakStatement(javaParser.BreakStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterContinueStatement(javaParser.ContinueStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitContinueStatement(javaParser.ContinueStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturnStatement(javaParser.ReturnStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturnStatement(javaParser.ReturnStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterThrowStatement(javaParser.ThrowStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitThrowStatement(javaParser.ThrowStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSynchronizedStatement(javaParser.SynchronizedStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSynchronizedStatement(javaParser.SynchronizedStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTryStatement(javaParser.TryStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTryStatement(javaParser.TryStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCatches(javaParser.CatchesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCatches(javaParser.CatchesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCatchClause(javaParser.CatchClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCatchClause(javaParser.CatchClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCatchFormalParameter(javaParser.CatchFormalParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCatchFormalParameter(javaParser.CatchFormalParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCatchType(javaParser.CatchTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCatchType(javaParser.CatchTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFinally_(javaParser.Finally_Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFinally_(javaParser.Finally_Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTryWithResourcesStatement(javaParser.TryWithResourcesStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTryWithResourcesStatement(javaParser.TryWithResourcesStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterResourceSpecification(javaParser.ResourceSpecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitResourceSpecification(javaParser.ResourceSpecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterResourceList(javaParser.ResourceListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitResourceList(javaParser.ResourceListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterResource(javaParser.ResourceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitResource(javaParser.ResourceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimary(javaParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimary(javaParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray(javaParser.PrimaryNoNewArrayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray(javaParser.PrimaryNoNewArrayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lf_arrayAccess(javaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lf_arrayAccess(javaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lfno_arrayAccess(javaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lfno_arrayAccess(javaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lf_primary(javaParser.PrimaryNoNewArray_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lf_primary(javaParser.PrimaryNoNewArray_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(javaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(javaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassInstanceCreationExpression(javaParser.ClassInstanceCreationExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassInstanceCreationExpression(javaParser.ClassInstanceCreationExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassInstanceCreationExpression_lf_primary(javaParser.ClassInstanceCreationExpression_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassInstanceCreationExpression_lf_primary(javaParser.ClassInstanceCreationExpression_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassInstanceCreationExpression_lfno_primary(javaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassInstanceCreationExpression_lfno_primary(javaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeArgumentsOrDiamond(javaParser.TypeArgumentsOrDiamondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeArgumentsOrDiamond(javaParser.TypeArgumentsOrDiamondContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFieldAccess(javaParser.FieldAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFieldAccess(javaParser.FieldAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFieldAccess_lf_primary(javaParser.FieldAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFieldAccess_lf_primary(javaParser.FieldAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFieldAccess_lfno_primary(javaParser.FieldAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFieldAccess_lfno_primary(javaParser.FieldAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayAccess(javaParser.ArrayAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayAccess(javaParser.ArrayAccessContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayAccess_lf_primary(javaParser.ArrayAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayAccess_lf_primary(javaParser.ArrayAccess_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayAccess_lfno_primary(javaParser.ArrayAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayAccess_lfno_primary(javaParser.ArrayAccess_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodInvocation(javaParser.MethodInvocationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodInvocation(javaParser.MethodInvocationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodInvocation_lf_primary(javaParser.MethodInvocation_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodInvocation_lf_primary(javaParser.MethodInvocation_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodInvocation_lfno_primary(javaParser.MethodInvocation_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodInvocation_lfno_primary(javaParser.MethodInvocation_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgumentList(javaParser.ArgumentListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgumentList(javaParser.ArgumentListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodReference(javaParser.MethodReferenceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodReference(javaParser.MethodReferenceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodReference_lf_primary(javaParser.MethodReference_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodReference_lf_primary(javaParser.MethodReference_lf_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodReference_lfno_primary(javaParser.MethodReference_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodReference_lfno_primary(javaParser.MethodReference_lfno_primaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayCreationExpression(javaParser.ArrayCreationExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayCreationExpression(javaParser.ArrayCreationExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDimExprs(javaParser.DimExprsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDimExprs(javaParser.DimExprsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDimExpr(javaParser.DimExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDimExpr(javaParser.DimExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstantExpression(javaParser.ConstantExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstantExpression(javaParser.ConstantExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(javaParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(javaParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLambdaExpression(javaParser.LambdaExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLambdaExpression(javaParser.LambdaExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLambdaParameters(javaParser.LambdaParametersContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLambdaParameters(javaParser.LambdaParametersContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInferredFormalParameterList(javaParser.InferredFormalParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInferredFormalParameterList(javaParser.InferredFormalParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLambdaBody(javaParser.LambdaBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLambdaBody(javaParser.LambdaBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentExpression(javaParser.AssignmentExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentExpression(javaParser.AssignmentExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(javaParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(javaParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLeftHandSide(javaParser.LeftHandSideContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLeftHandSide(javaParser.LeftHandSideContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentOperator(javaParser.AssignmentOperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentOperator(javaParser.AssignmentOperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditionalExpression(javaParser.ConditionalExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditionalExpression(javaParser.ConditionalExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditionalOrExpression(javaParser.ConditionalOrExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditionalOrExpression(javaParser.ConditionalOrExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditionalAndExpression(javaParser.ConditionalAndExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditionalAndExpression(javaParser.ConditionalAndExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInclusiveOrExpression(javaParser.InclusiveOrExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInclusiveOrExpression(javaParser.InclusiveOrExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExclusiveOrExpression(javaParser.ExclusiveOrExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExclusiveOrExpression(javaParser.ExclusiveOrExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAndExpression(javaParser.AndExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAndExpression(javaParser.AndExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEqualityExpression(javaParser.EqualityExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEqualityExpression(javaParser.EqualityExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelationalExpression(javaParser.RelationalExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelationalExpression(javaParser.RelationalExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterShiftExpression(javaParser.ShiftExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitShiftExpression(javaParser.ShiftExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAdditiveExpression(javaParser.AdditiveExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdditiveExpression(javaParser.AdditiveExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultiplicativeExpression(javaParser.MultiplicativeExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultiplicativeExpression(javaParser.MultiplicativeExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnaryExpression(javaParser.UnaryExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnaryExpression(javaParser.UnaryExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPreIncrementExpression(javaParser.PreIncrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPreIncrementExpression(javaParser.PreIncrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPreDecrementExpression(javaParser.PreDecrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPreDecrementExpression(javaParser.PreDecrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnaryExpressionNotPlusMinus(javaParser.UnaryExpressionNotPlusMinusContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnaryExpressionNotPlusMinus(javaParser.UnaryExpressionNotPlusMinusContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostfixExpression(javaParser.PostfixExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostfixExpression(javaParser.PostfixExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostIncrementExpression(javaParser.PostIncrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostIncrementExpression(javaParser.PostIncrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostIncrementExpression_lf_postfixExpression(javaParser.PostIncrementExpression_lf_postfixExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostIncrementExpression_lf_postfixExpression(javaParser.PostIncrementExpression_lf_postfixExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostDecrementExpression(javaParser.PostDecrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostDecrementExpression(javaParser.PostDecrementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostDecrementExpression_lf_postfixExpression(javaParser.PostDecrementExpression_lf_postfixExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostDecrementExpression_lf_postfixExpression(javaParser.PostDecrementExpression_lf_postfixExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCastExpression(javaParser.CastExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCastExpression(javaParser.CastExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}