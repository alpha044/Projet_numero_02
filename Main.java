           <html>
<head>
<title>Main.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #6aab73;}
.s4 { color: #2aacb8;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Main.java</font>
</center></td></tr></table>
<pre><span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">time</span><span class="s2">.</span><span class="s1">LocalDate</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">Main </span><span class="s2">{</span>
    <span class="s0">public static void </span><span class="s1">main</span><span class="s2">(</span><span class="s1">String</span><span class="s2">[] </span><span class="s1">args</span><span class="s2">){</span>
        <span class="s1">Fichier Fichier</span><span class="s2">=</span><span class="s0">new </span><span class="s1">Fichier</span><span class="s2">(</span>
                <span class="s3">&quot;alpha&quot;</span><span class="s2">,</span>
                <span class="s4">0</span><span class="s2">,</span>
                <span class="s3">&quot;15/11/20125&quot;</span><span class="s2">,</span>
                <span class="s3">&quot;Desktop&quot;</span>
                <span class="s2">);</span>


        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;nom du fichier&quot; </span><span class="s2">+ </span><span class="s1">Fichier</span><span class="s2">.</span><span class="s1">nom</span><span class="s2">);</span>
      

    <span class="s2">}</span>


<span class="s2">}</span>
</pre>
</body>
</html>