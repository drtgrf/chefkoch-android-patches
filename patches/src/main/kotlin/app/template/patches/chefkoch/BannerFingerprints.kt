package app.template.patches.chefkoch

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

object CkAdmoBannerFingerprint : Fingerprint(
    definingClass = "Lde/chefkoch/component/ad/admo/ui/banner/CkAdmoBannerKt;",
    name = "CkAdmoBanner",
    accessFlags = listOf(
        AccessFlags.PUBLIC,
        AccessFlags.STATIC,
        AccessFlags.FINAL
    ),
    returnType = "V",
    parameters = listOf(
        "L",
        "Landroidx/compose/ui/Modifier;",
        "Ljava/lang/String;",
        "Landroidx/compose/runtime/Composer;",
        "I",
        "I"
    )
)
