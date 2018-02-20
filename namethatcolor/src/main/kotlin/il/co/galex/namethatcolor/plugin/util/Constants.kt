package il.co.galex.namethatcolor.plugin.util

import com.intellij.codeInsight.completion.CompletionUtilCore
import com.intellij.patterns.XmlPatterns
import com.intellij.psi.xml.XmlTag
import com.intellij.psi.xml.XmlToken

const val RESOURCES_TAG_NAME = "resources"
val PLACE = XmlPatterns.psiElement(XmlToken::class.java)
        .withText(CompletionUtilCore.DUMMY_IDENTIFIER_TRIMMED)
        .withParent(XmlPatterns.xmlText()
                .withParent(XmlPatterns.psiElement(XmlTag::class.java)
                        .withName(RESOURCES_TAG_NAME)
                )
        )