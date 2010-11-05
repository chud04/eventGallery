<#include "/${parameters.templateDir}/xhtml/form-validate.ftl" />
<#include "/${parameters.templateDir}/philipp/form-common.ftl" />
<#if (parameters.validate?default(false))>
  onreset="${parameters.onreset?default('clearErrorMessages(this);clearErrorLabels(this);')}"
<#else>
  <#if parameters.onreset??>
  onreset="${parameters.onreset?html}"
  </#if>
</#if>
><#rt/>
