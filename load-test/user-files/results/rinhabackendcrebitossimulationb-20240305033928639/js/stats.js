var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name--1146707516",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "97",
        "ok": "91",
        "ko": "6"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "1"
    },
    "maxResponseTime": {
        "total": "45",
        "ok": "45",
        "ko": "2"
    },
    "meanResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "2"
    },
    "standardDeviation": {
        "total": "16",
        "ok": "16",
        "ko": "0"
    },
    "percentiles1": {
        "total": "3",
        "ok": "3",
        "ko": "2"
    },
    "percentiles2": {
        "total": "24",
        "ok": "25",
        "ko": "2"
    },
    "percentiles3": {
        "total": "42",
        "ok": "43",
        "ko": "2"
    },
    "percentiles4": {
        "total": "44",
        "ok": "44",
        "ko": "2"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 91,
    "percentage": 94
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 6,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "32.333",
        "ok": "30.333",
        "ko": "2"
    }
},
contents: {
"req_validac-o-es--40002687": {
        type: "REQUEST",
        name: "validações",
path: "validações",
pathFormatted: "req_validac-o-es--40002687",
stats: {
    "name": "validações",
    "numberOfRequests": {
        "total": "97",
        "ok": "91",
        "ko": "6"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "1"
    },
    "maxResponseTime": {
        "total": "45",
        "ok": "45",
        "ko": "2"
    },
    "meanResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "2"
    },
    "standardDeviation": {
        "total": "16",
        "ok": "16",
        "ko": "0"
    },
    "percentiles1": {
        "total": "3",
        "ok": "3",
        "ko": "2"
    },
    "percentiles2": {
        "total": "24",
        "ok": "25",
        "ko": "2"
    },
    "percentiles3": {
        "total": "42",
        "ok": "43",
        "ko": "2"
    },
    "percentiles4": {
        "total": "44",
        "ok": "44",
        "ko": "2"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 91,
    "percentage": 94
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 6,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "32.333",
        "ok": "30.333",
        "ko": "2"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
