package com.soywiz.kpspemu.hle.modules

import com.soywiz.kpspemu.Emulator
import com.soywiz.kpspemu.cpu.CpuState
import com.soywiz.kpspemu.hle.SceModule
import com.soywiz.kpspemu.mem.Ptr

@Suppress("UNUSED_PARAMETER")
class sceUtility(emulator: Emulator) : SceModule(emulator, "sceUtility", 0x40010011, "utility.prx", "sceUtility_Driver") {
	fun sceUtilitySavedataInitStart(params: Ptr): Int {
		logger.warn { "sceUtilitySavedataInitStart: $params" }
		//return Promise2.resolve(this._sceUtilitySavedataInitStart(paramsPtr.clone())).then(result => {
		//	var params = SceUtilitySavedataParam.struct.read(paramsPtr.clone());
		//	params.base.result = result;
		//	return 0;
		//});
		return 0
	}

	fun sceUtilitySavedataGetStatus(): Int {
		return 0
	}

	fun sceUtility_0251B134(cpu: CpuState): Unit = UNIMPLEMENTED(0x0251B134)
	fun sceUtilityHtmlViewerUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0x05AFB9E4)
	fun sceUtility_06A48659(cpu: CpuState): Unit = UNIMPLEMENTED(0x06A48659)
	fun sceUtilityLoadUsbModule(cpu: CpuState): Unit = UNIMPLEMENTED(0x0D5BC6D2)
	fun sceUtility_0F3EEAAC(cpu: CpuState): Unit = UNIMPLEMENTED(0x0F3EEAAC)
	fun sceUtilityInstallInitStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x1281DA8E)
	fun sceUtility_147F7C85(cpu: CpuState): Unit = UNIMPLEMENTED(0x147F7C85)
	fun sceUtility_149A7895(cpu: CpuState): Unit = UNIMPLEMENTED(0x149A7895)
	fun sceUtilityLoadNetModule(cpu: CpuState): Unit = UNIMPLEMENTED(0x1579A159)
	fun sceUtility_16A1A8D8(cpu: CpuState): Unit = UNIMPLEMENTED(0x16A1A8D8)
	fun sceUtility_16D02AF0(cpu: CpuState): Unit = UNIMPLEMENTED(0x16D02AF0)
	fun sceUtility_28D35634(cpu: CpuState): Unit = UNIMPLEMENTED(0x28D35634)
	fun sceUtility_2995D020(cpu: CpuState): Unit = UNIMPLEMENTED(0x2995D020)
	fun sceUtilityLoadModule(cpu: CpuState): Unit = UNIMPLEMENTED(0x2A2B3DE0)
	fun sceUtilityMsgDialogInitStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x2AD8E239)
	fun sceUtility_2B96173B(cpu: CpuState): Unit = UNIMPLEMENTED(0x2B96173B)
	fun sceUtilityGetSystemParamString(cpu: CpuState): Unit = UNIMPLEMENTED(0x34B78343)
	fun sceUtility_3AAD51DC(cpu: CpuState): Unit = UNIMPLEMENTED(0x3AAD51DC)
	fun sceNetplayDialogInitStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x3AD50AE7)
	fun sceUtilityOskShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x3DFAEBA9)
	fun sceNetplayDialogUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0x417BED54)
	fun sceUtilitySetSystemParamString(cpu: CpuState): Unit = UNIMPLEMENTED(0x41E30674)
	fun sceUtility_42071A83(cpu: CpuState): Unit = UNIMPLEMENTED(0x42071A83)
	fun sceUtilityGetNetParam(cpu: CpuState): Unit = UNIMPLEMENTED(0x434D4B3A)
	fun sceUtilitySetSystemParamInt(cpu: CpuState): Unit = UNIMPLEMENTED(0x45C18506)
	fun sceUtilityMsgDialogAbort(cpu: CpuState): Unit = UNIMPLEMENTED(0x4928BD96)
	fun sceUtility_4A833BA4(cpu: CpuState): Unit = UNIMPLEMENTED(0x4A833BA4)
	fun sceUtility_4B0A8FE5(cpu: CpuState): Unit = UNIMPLEMENTED(0x4B0A8FE5)
	fun sceUtilityOskUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0x4B85C861)
	fun sceUtilityNetconfInitStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x4DB1E739)
	fun sceUtilityGetNetParamLatestID(cpu: CpuState): Unit = UNIMPLEMENTED(0x4FED24D8)
	fun sceUtility_54A5C62F(cpu: CpuState): Unit = UNIMPLEMENTED(0x54A5C62F)
	fun sceUtilityCheckNetParam(cpu: CpuState): Unit = UNIMPLEMENTED(0x5EEE6548)
	fun sceUtilityInstallShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x5EF1C24A)
	fun sceUtilityNetconfGetStatus(cpu: CpuState): Unit = UNIMPLEMENTED(0x6332AA39)
	fun sceUtilityUnloadNetModule(cpu: CpuState): Unit = UNIMPLEMENTED(0x64D50C56)
	fun sceUtilityMsgDialogShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x67AF3428)
	fun sceUtility_6F56F9CF(cpu: CpuState): Unit = UNIMPLEMENTED(0x6F56F9CF)
	fun sceUtility_70267ADF(cpu: CpuState): Unit = UNIMPLEMENTED(0x70267ADF)
	fun sceUtilityGameSharingUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0x7853182D)
	fun sceUtility_81C44706(cpu: CpuState): Unit = UNIMPLEMENTED(0x81C44706)
	fun sceUtility_8326AB05(cpu: CpuState): Unit = UNIMPLEMENTED(0x8326AB05)
	fun sceUtility_86A03A27(cpu: CpuState): Unit = UNIMPLEMENTED(0x86A03A27)
	fun sceUtility_86ABDB1B(cpu: CpuState): Unit = UNIMPLEMENTED(0x86ABDB1B)
	fun sceUtility_88BC7406(cpu: CpuState): Unit = UNIMPLEMENTED(0x88BC7406)
	fun sceUtility_89317C8F(cpu: CpuState): Unit = UNIMPLEMENTED(0x89317C8F)
	fun sceUtilityNetconfUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0x91E70E35)
	fun sceUtility_943CBA46(cpu: CpuState): Unit = UNIMPLEMENTED(0x943CBA46)
	fun sceUtilityGameSharingGetStatus(cpu: CpuState): Unit = UNIMPLEMENTED(0x946963F3)
	fun sceUtilityMsgDialogUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0x95FC253B)
	fun sceUtilitySavedataShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0x9790B33C)
	fun sceUtilityMsgDialogGetStatus(cpu: CpuState): Unit = UNIMPLEMENTED(0x9A1C91D7)
	fun sceUtilityInstallUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0xA03D29BA)
	fun sceUtility_A084E056(cpu: CpuState): Unit = UNIMPLEMENTED(0xA084E056)
	fun sceUtility_A50E5B30(cpu: CpuState): Unit = UNIMPLEMENTED(0xA50E5B30)
	fun sceUtilityGetSystemParamInt(cpu: CpuState): Unit = UNIMPLEMENTED(0xA5DA2406)
	fun sceUtility_AB083EA9(cpu: CpuState): Unit = UNIMPLEMENTED(0xAB083EA9)
	fun sceUtility_B0FB7FF5(cpu: CpuState): Unit = UNIMPLEMENTED(0xB0FB7FF5)
	fun sceUtility_B62A4061(cpu: CpuState): Unit = UNIMPLEMENTED(0xB62A4061)
	fun sceNetplayDialogGetStatus(cpu: CpuState): Unit = UNIMPLEMENTED(0xB6CEE597)
	fun sceUtility_B8592D5F(cpu: CpuState): Unit = UNIMPLEMENTED(0xB8592D5F)
	fun sceNetplayDialogShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0xBC6B6296)
	fun sceUtilityHtmlViewerGetStatus(cpu: CpuState): Unit = UNIMPLEMENTED(0xBDA7D894)
	fun sceUtilityInstallGetStatus(cpu: CpuState): Unit = UNIMPLEMENTED(0xC4700FA3)
	fun sceUtilityGameSharingInitStart(cpu: CpuState): Unit = UNIMPLEMENTED(0xC492F751)
	fun sceUtilityLoadAvModule(cpu: CpuState): Unit = UNIMPLEMENTED(0xC629AF26)
	fun sceUtilityHtmlViewerInitStart(cpu: CpuState): Unit = UNIMPLEMENTED(0xCDC3AA41)
	fun sceUtility_D17A0573(cpu: CpuState): Unit = UNIMPLEMENTED(0xD17A0573)
	fun sceUtilitySavedataUpdate(cpu: CpuState): Unit = UNIMPLEMENTED(0xD4B95FFB)
	fun sceUtility_D81957B7(cpu: CpuState): Unit = UNIMPLEMENTED(0xD81957B7)
	fun sceUtility_D852CDCE(cpu: CpuState): Unit = UNIMPLEMENTED(0xD852CDCE)
	fun sceUtility_DA97F1AA(cpu: CpuState): Unit = UNIMPLEMENTED(0xDA97F1AA)
	fun sceUtility_DDE5389D(cpu: CpuState): Unit = UNIMPLEMENTED(0xDDE5389D)
	fun sceUtility_E19C97D6(cpu: CpuState): Unit = UNIMPLEMENTED(0xE19C97D6)
	fun sceUtilityUnloadModule(cpu: CpuState): Unit = UNIMPLEMENTED(0xE49BFE92)
	fun sceUtility_E7B778D8(cpu: CpuState): Unit = UNIMPLEMENTED(0xE7B778D8)
	fun sceUtility_ECE1D3E5(cpu: CpuState): Unit = UNIMPLEMENTED(0xECE1D3E5)
	fun sceUtility_ED0FAD38(cpu: CpuState): Unit = UNIMPLEMENTED(0xED0FAD38)
	fun sceUtility_EF3582B2(cpu: CpuState): Unit = UNIMPLEMENTED(0xEF3582B2)
	fun sceUtilityGameSharingShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0xEFC6F80F)
	fun sceUtilityOskGetStatus(cpu: CpuState): Unit = UNIMPLEMENTED(0xF3F76017)
	fun sceUtility_F3FBC572(cpu: CpuState): Unit = UNIMPLEMENTED(0xF3FBC572)
	fun sceUtilityHtmlViewerShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0xF5CE1134)
	fun sceUtilityOskInitStart(cpu: CpuState): Unit = UNIMPLEMENTED(0xF6269B82)
	fun sceUtilityUnloadUsbModule(cpu: CpuState): Unit = UNIMPLEMENTED(0xF64910F0)
	fun sceUtilityUnloadAvModule(cpu: CpuState): Unit = UNIMPLEMENTED(0xF7D8D092)
	fun sceUtilityNetconfShutdownStart(cpu: CpuState): Unit = UNIMPLEMENTED(0xF88155F6)
	fun sceUtility_F9E0008C(cpu: CpuState): Unit = UNIMPLEMENTED(0xF9E0008C)


	override fun registerModule() {
		registerFunctionInt("sceUtilitySavedataInitStart", 0x50C4CD57, since = 150) { sceUtilitySavedataInitStart(ptr) }
		registerFunctionInt("sceUtilitySavedataGetStatus", 0x8874DBE0, since = 150) { sceUtilitySavedataGetStatus() }

		registerFunctionRaw("sceUtility_0251B134", 0x0251B134, since = 150) { sceUtility_0251B134(it) }
		registerFunctionRaw("sceUtilityHtmlViewerUpdate", 0x05AFB9E4, since = 150) { sceUtilityHtmlViewerUpdate(it) }
		registerFunctionRaw("sceUtility_06A48659", 0x06A48659, since = 150) { sceUtility_06A48659(it) }
		registerFunctionRaw("sceUtilityLoadUsbModule", 0x0D5BC6D2, since = 150) { sceUtilityLoadUsbModule(it) }
		registerFunctionRaw("sceUtility_0F3EEAAC", 0x0F3EEAAC, since = 150) { sceUtility_0F3EEAAC(it) }
		registerFunctionRaw("sceUtilityInstallInitStart", 0x1281DA8E, since = 150) { sceUtilityInstallInitStart(it) }
		registerFunctionRaw("sceUtility_147F7C85", 0x147F7C85, since = 150) { sceUtility_147F7C85(it) }
		registerFunctionRaw("sceUtility_149A7895", 0x149A7895, since = 150) { sceUtility_149A7895(it) }
		registerFunctionRaw("sceUtilityLoadNetModule", 0x1579A159, since = 150) { sceUtilityLoadNetModule(it) }
		registerFunctionRaw("sceUtility_16A1A8D8", 0x16A1A8D8, since = 150) { sceUtility_16A1A8D8(it) }
		registerFunctionRaw("sceUtility_16D02AF0", 0x16D02AF0, since = 150) { sceUtility_16D02AF0(it) }
		registerFunctionRaw("sceUtility_28D35634", 0x28D35634, since = 150) { sceUtility_28D35634(it) }
		registerFunctionRaw("sceUtility_2995D020", 0x2995D020, since = 150) { sceUtility_2995D020(it) }
		registerFunctionRaw("sceUtilityLoadModule", 0x2A2B3DE0, since = 150) { sceUtilityLoadModule(it) }
		registerFunctionRaw("sceUtilityMsgDialogInitStart", 0x2AD8E239, since = 150) { sceUtilityMsgDialogInitStart(it) }
		registerFunctionRaw("sceUtility_2B96173B", 0x2B96173B, since = 150) { sceUtility_2B96173B(it) }
		registerFunctionRaw("sceUtilityGetSystemParamString", 0x34B78343, since = 150) { sceUtilityGetSystemParamString(it) }
		registerFunctionRaw("sceUtility_3AAD51DC", 0x3AAD51DC, since = 150) { sceUtility_3AAD51DC(it) }
		registerFunctionRaw("sceNetplayDialogInitStart", 0x3AD50AE7, since = 150) { sceNetplayDialogInitStart(it) }
		registerFunctionRaw("sceUtilityOskShutdownStart", 0x3DFAEBA9, since = 150) { sceUtilityOskShutdownStart(it) }
		registerFunctionRaw("sceNetplayDialogUpdate", 0x417BED54, since = 150) { sceNetplayDialogUpdate(it) }
		registerFunctionRaw("sceUtilitySetSystemParamString", 0x41E30674, since = 150) { sceUtilitySetSystemParamString(it) }
		registerFunctionRaw("sceUtility_42071A83", 0x42071A83, since = 150) { sceUtility_42071A83(it) }
		registerFunctionRaw("sceUtilityGetNetParam", 0x434D4B3A, since = 150) { sceUtilityGetNetParam(it) }
		registerFunctionRaw("sceUtilitySetSystemParamInt", 0x45C18506, since = 150) { sceUtilitySetSystemParamInt(it) }
		registerFunctionRaw("sceUtilityMsgDialogAbort", 0x4928BD96, since = 150) { sceUtilityMsgDialogAbort(it) }
		registerFunctionRaw("sceUtility_4A833BA4", 0x4A833BA4, since = 150) { sceUtility_4A833BA4(it) }
		registerFunctionRaw("sceUtility_4B0A8FE5", 0x4B0A8FE5, since = 150) { sceUtility_4B0A8FE5(it) }
		registerFunctionRaw("sceUtilityOskUpdate", 0x4B85C861, since = 150) { sceUtilityOskUpdate(it) }
		registerFunctionRaw("sceUtilityNetconfInitStart", 0x4DB1E739, since = 150) { sceUtilityNetconfInitStart(it) }
		registerFunctionRaw("sceUtilityGetNetParamLatestID", 0x4FED24D8, since = 150) { sceUtilityGetNetParamLatestID(it) }
		registerFunctionRaw("sceUtility_54A5C62F", 0x54A5C62F, since = 150) { sceUtility_54A5C62F(it) }
		registerFunctionRaw("sceUtilityCheckNetParam", 0x5EEE6548, since = 150) { sceUtilityCheckNetParam(it) }
		registerFunctionRaw("sceUtilityInstallShutdownStart", 0x5EF1C24A, since = 150) { sceUtilityInstallShutdownStart(it) }
		registerFunctionRaw("sceUtilityNetconfGetStatus", 0x6332AA39, since = 150) { sceUtilityNetconfGetStatus(it) }
		registerFunctionRaw("sceUtilityUnloadNetModule", 0x64D50C56, since = 150) { sceUtilityUnloadNetModule(it) }
		registerFunctionRaw("sceUtilityMsgDialogShutdownStart", 0x67AF3428, since = 150) { sceUtilityMsgDialogShutdownStart(it) }
		registerFunctionRaw("sceUtility_6F56F9CF", 0x6F56F9CF, since = 150) { sceUtility_6F56F9CF(it) }
		registerFunctionRaw("sceUtility_70267ADF", 0x70267ADF, since = 150) { sceUtility_70267ADF(it) }
		registerFunctionRaw("sceUtilityGameSharingUpdate", 0x7853182D, since = 150) { sceUtilityGameSharingUpdate(it) }
		registerFunctionRaw("sceUtility_81C44706", 0x81C44706, since = 150) { sceUtility_81C44706(it) }
		registerFunctionRaw("sceUtility_8326AB05", 0x8326AB05, since = 150) { sceUtility_8326AB05(it) }
		registerFunctionRaw("sceUtility_86A03A27", 0x86A03A27, since = 150) { sceUtility_86A03A27(it) }
		registerFunctionRaw("sceUtility_86ABDB1B", 0x86ABDB1B, since = 150) { sceUtility_86ABDB1B(it) }
		registerFunctionRaw("sceUtility_88BC7406", 0x88BC7406, since = 150) { sceUtility_88BC7406(it) }
		registerFunctionRaw("sceUtility_89317C8F", 0x89317C8F, since = 150) { sceUtility_89317C8F(it) }
		registerFunctionRaw("sceUtilityNetconfUpdate", 0x91E70E35, since = 150) { sceUtilityNetconfUpdate(it) }
		registerFunctionRaw("sceUtility_943CBA46", 0x943CBA46, since = 150) { sceUtility_943CBA46(it) }
		registerFunctionRaw("sceUtilityGameSharingGetStatus", 0x946963F3, since = 150) { sceUtilityGameSharingGetStatus(it) }
		registerFunctionRaw("sceUtilityMsgDialogUpdate", 0x95FC253B, since = 150) { sceUtilityMsgDialogUpdate(it) }
		registerFunctionRaw("sceUtilitySavedataShutdownStart", 0x9790B33C, since = 150) { sceUtilitySavedataShutdownStart(it) }
		registerFunctionRaw("sceUtilityMsgDialogGetStatus", 0x9A1C91D7, since = 150) { sceUtilityMsgDialogGetStatus(it) }
		registerFunctionRaw("sceUtilityInstallUpdate", 0xA03D29BA, since = 150) { sceUtilityInstallUpdate(it) }
		registerFunctionRaw("sceUtility_A084E056", 0xA084E056, since = 150) { sceUtility_A084E056(it) }
		registerFunctionRaw("sceUtility_A50E5B30", 0xA50E5B30, since = 150) { sceUtility_A50E5B30(it) }
		registerFunctionRaw("sceUtilityGetSystemParamInt", 0xA5DA2406, since = 150) { sceUtilityGetSystemParamInt(it) }
		registerFunctionRaw("sceUtility_AB083EA9", 0xAB083EA9, since = 150) { sceUtility_AB083EA9(it) }
		registerFunctionRaw("sceUtility_B0FB7FF5", 0xB0FB7FF5, since = 150) { sceUtility_B0FB7FF5(it) }
		registerFunctionRaw("sceUtility_B62A4061", 0xB62A4061, since = 150) { sceUtility_B62A4061(it) }
		registerFunctionRaw("sceNetplayDialogGetStatus", 0xB6CEE597, since = 150) { sceNetplayDialogGetStatus(it) }
		registerFunctionRaw("sceUtility_B8592D5F", 0xB8592D5F, since = 150) { sceUtility_B8592D5F(it) }
		registerFunctionRaw("sceNetplayDialogShutdownStart", 0xBC6B6296, since = 150) { sceNetplayDialogShutdownStart(it) }
		registerFunctionRaw("sceUtilityHtmlViewerGetStatus", 0xBDA7D894, since = 150) { sceUtilityHtmlViewerGetStatus(it) }
		registerFunctionRaw("sceUtilityInstallGetStatus", 0xC4700FA3, since = 150) { sceUtilityInstallGetStatus(it) }
		registerFunctionRaw("sceUtilityGameSharingInitStart", 0xC492F751, since = 150) { sceUtilityGameSharingInitStart(it) }
		registerFunctionRaw("sceUtilityLoadAvModule", 0xC629AF26, since = 150) { sceUtilityLoadAvModule(it) }
		registerFunctionRaw("sceUtilityHtmlViewerInitStart", 0xCDC3AA41, since = 150) { sceUtilityHtmlViewerInitStart(it) }
		registerFunctionRaw("sceUtility_D17A0573", 0xD17A0573, since = 150) { sceUtility_D17A0573(it) }
		registerFunctionRaw("sceUtilitySavedataUpdate", 0xD4B95FFB, since = 150) { sceUtilitySavedataUpdate(it) }
		registerFunctionRaw("sceUtility_D81957B7", 0xD81957B7, since = 150) { sceUtility_D81957B7(it) }
		registerFunctionRaw("sceUtility_D852CDCE", 0xD852CDCE, since = 150) { sceUtility_D852CDCE(it) }
		registerFunctionRaw("sceUtility_DA97F1AA", 0xDA97F1AA, since = 150) { sceUtility_DA97F1AA(it) }
		registerFunctionRaw("sceUtility_DDE5389D", 0xDDE5389D, since = 150) { sceUtility_DDE5389D(it) }
		registerFunctionRaw("sceUtility_E19C97D6", 0xE19C97D6, since = 150) { sceUtility_E19C97D6(it) }
		registerFunctionRaw("sceUtilityUnloadModule", 0xE49BFE92, since = 150) { sceUtilityUnloadModule(it) }
		registerFunctionRaw("sceUtility_E7B778D8", 0xE7B778D8, since = 150) { sceUtility_E7B778D8(it) }
		registerFunctionRaw("sceUtility_ECE1D3E5", 0xECE1D3E5, since = 150) { sceUtility_ECE1D3E5(it) }
		registerFunctionRaw("sceUtility_ED0FAD38", 0xED0FAD38, since = 150) { sceUtility_ED0FAD38(it) }
		registerFunctionRaw("sceUtility_EF3582B2", 0xEF3582B2, since = 150) { sceUtility_EF3582B2(it) }
		registerFunctionRaw("sceUtilityGameSharingShutdownStart", 0xEFC6F80F, since = 150) { sceUtilityGameSharingShutdownStart(it) }
		registerFunctionRaw("sceUtilityOskGetStatus", 0xF3F76017, since = 150) { sceUtilityOskGetStatus(it) }
		registerFunctionRaw("sceUtility_F3FBC572", 0xF3FBC572, since = 150) { sceUtility_F3FBC572(it) }
		registerFunctionRaw("sceUtilityHtmlViewerShutdownStart", 0xF5CE1134, since = 150) { sceUtilityHtmlViewerShutdownStart(it) }
		registerFunctionRaw("sceUtilityOskInitStart", 0xF6269B82, since = 150) { sceUtilityOskInitStart(it) }
		registerFunctionRaw("sceUtilityUnloadUsbModule", 0xF64910F0, since = 150) { sceUtilityUnloadUsbModule(it) }
		registerFunctionRaw("sceUtilityUnloadAvModule", 0xF7D8D092, since = 150) { sceUtilityUnloadAvModule(it) }
		registerFunctionRaw("sceUtilityNetconfShutdownStart", 0xF88155F6, since = 150) { sceUtilityNetconfShutdownStart(it) }
		registerFunctionRaw("sceUtility_F9E0008C", 0xF9E0008C, since = 150) { sceUtility_F9E0008C(it) }
	}
}
