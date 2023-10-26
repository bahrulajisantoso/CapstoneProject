package com.example.capstoneproject.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TeamsResponse(

	@field:SerializedName("teams")
	val teams: List<TeamsItem>
)

data class TeamsItem(

	@field:SerializedName("intStadiumCapacity")
	val intStadiumCapacity: String,

	@field:SerializedName("strTeamShort")
	val strTeamShort: String,

	@field:SerializedName("idLeague3")
	val idLeague3: String,

	@field:SerializedName("idLeague2")
	val idLeague2: String,

	@field:SerializedName("idLeague5")
	val idLeague5: String,

	@field:SerializedName("strSport")
	val strSport: String,

	@field:SerializedName("idLeague4")
	val idLeague4: String,

	@field:SerializedName("idLeague7")
	val idLeague7: Any,

	@field:SerializedName("idLeague6")
	val idLeague6: Any,

	@field:SerializedName("strTeamJersey")
	val strTeamJersey: String,

	@field:SerializedName("strTeamFanart2")
	val strTeamFanart2: String,

	@field:SerializedName("strTeamFanart3")
	val strTeamFanart3: String,

	@field:SerializedName("strTeamFanart4")
	val strTeamFanart4: String,

	@field:SerializedName("strStadiumDescription")
	val strStadiumDescription: String,

	@field:SerializedName("strTeamFanart1")
	val strTeamFanart1: String,

	@field:SerializedName("intLoved")
	val intLoved: String,

	@field:SerializedName("idLeague")
	val idLeague: String,

	@field:SerializedName("idSoccerXML")
	val idSoccerXML: String,

	@field:SerializedName("strTeamLogo")
	val strTeamLogo: String,

	@field:SerializedName("strStadiumLocation")
	val strStadiumLocation: String,

	@field:SerializedName("strCountry")
	val strCountry: String,

	@field:SerializedName("strRSS")
	val strRSS: String,

	@field:SerializedName("strTeamBanner")
	val strTeamBanner: String,

	@field:SerializedName("strStadiumThumb")
	val strStadiumThumb: String,

	@field:SerializedName("intFormedYear")
	val intFormedYear: String,

	@field:SerializedName("strInstagram")
	val strInstagram: String,

	@field:SerializedName("idTeam")
	val idTeam: String,

	@field:SerializedName("strDescriptionEN")
	val strDescriptionEN: String,

	@field:SerializedName("strWebsite")
	val strWebsite: String,

	@field:SerializedName("strYoutube")
	val strYoutube: String,

	@field:SerializedName("idAPIfootball")
	val idAPIfootball: String,

	@field:SerializedName("strLocked")
	val strLocked: String,

	@field:SerializedName("strKitColour3")
	val strKitColour3: String,

	@field:SerializedName("strAlternate")
	val strAlternate: String,

	@field:SerializedName("strTeam")
	val strTeam: String,

	@field:SerializedName("strTwitter")
	val strTwitter: String,

	@field:SerializedName("strKitColour1")
	val strKitColour1: String,

	@field:SerializedName("strKitColour2")
	val strKitColour2: String,

	@field:SerializedName("strGender")
	val strGender: String,

	@field:SerializedName("strDivision")
	val strDivision: Any,

	@field:SerializedName("strStadium")
	val strStadium: String,

	@field:SerializedName("strFacebook")
	val strFacebook: String,

	@field:SerializedName("strTeamBadge")
	val strTeamBadge: String,

	@field:SerializedName("strLeague2")
	val strLeague2: String,

	@field:SerializedName("strLeague3")
	val strLeague3: String,

	@field:SerializedName("strLeague4")
	val strLeague4: String,

	@field:SerializedName("strLeague5")
	val strLeague5: String,

	@field:SerializedName("strLeague6")
	val strLeague6: String,

	@field:SerializedName("strLeague7")
	val strLeague7: String,

	@field:SerializedName("strLeague")
	val strLeague: String,

	@field:SerializedName("strKeywords")
	val strKeywords: String,
)
