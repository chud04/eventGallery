<#include "/${parameters.templateDir}/simple/form-close.ftl" /><#t/>
<#include "/${parameters.templateDir}/xhtml/form-close-validate.ftl" />
<#if parameters.focusElement?if_exists != "">
<script type="text/javascript">
    StrutsUtils.addOnLoad(function() {
        var element = document.getElementById("${parameters.focusElement?html}");
        if(element) {
            element.focus();
        }
    });
</script>
</#if>