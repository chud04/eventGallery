<#assign hasFieldErrors = parameters.name?? && fieldErrors?? && fieldErrors[parameters.name]??/>
<#if parameters.labelposition?default("top") == 'top'>
<div class="group"><#rt/>
<#if hasFieldErrors>
<div class="fieldWithErrors"><#rt/>
</#if>
<#if parameters.label??>
<label<#rt/>
<#if parameters.id??>
 for="${parameters.id?html}"<#rt/>
</#if>
 class="label"><#rt/>
${parameters.label?html}<#rt/>
<#if parameters.required?default(false)>
<span class="required">*</span><#rt/>
</#if>
</label><#rt/>
</#if>
<#if hasFieldErrors>
<span class="error"> ${fieldErrors[parameters.name][0]?html}</span></div><#rt/>
</#if>
<#else>
<div class="group wat-cf"><#rt/>
<#if parameters.label??>
<div class="left"><label<#rt/>
<#if parameters.id??>
 for="${parameters.id?html}"<#rt/>
</#if>
 class="label right">${parameters.label?html}</label></div><#rt/>
</#if>
<div class="right"><#rt/>
</#if>
